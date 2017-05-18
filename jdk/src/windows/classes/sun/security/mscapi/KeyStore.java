/*
 * Copyright (c) 2005, 2011, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package sun.security.mscapi;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.InvalidKeyException;
import java.security.KeyStoreSpi;
import java.security.KeyStoreException;
import java.security.UnrecoverableKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecurityPermission;
import java.security.cert.X509Certificate;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.interfaces.RSAPrivateCrtKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.UUID;

import sun.security.action.GetPropertyAction;

/**
 * Implementation of key store for Windows using the Microsoft Crypto API.
 *
 * @since 1.6
 */
abstract class KeyStore extends KeyStoreSpi {

    public static final class MY extends KeyStore {
        public MY() {
            super("MY");
        }
    }

    public static final class ROOT extends KeyStore {
        public ROOT() {
            super("ROOT");
        }
    }

    class KeyEntry
    {
        private Key privateKey;
        private X509Certificate certChain[];
        private String alias;

        KeyEntry(Key key, X509Certificate[] chain) {
            this(null, key, chain);
        }

        KeyEntry(String alias, Key key, X509Certificate[] chain) {
            this.privateKey = key;
            this.certChain = chain;
            /*
             * The default alias for both entry types is derived from a
             * hash value intrinsic to the first certificate in the chain.
             */
             if (alias == null) {
                 this.alias = Integer.toString(chain[0].hashCode());
             } else {
                 this.alias = alias;
             }
        }

        /**
         * Gets the alias for the keystore entry.
         */
        String getAlias()
        {
            return alias;
        }

        /**
         * Sets the alias for the keystore entry.
         */
        void setAlias(String alias)
        {
            // TODO - set friendly name prop in cert store
            this.alias = alias;
        }

        /**
         * Gets the private key for the keystore entry.
         */
        Key getPrivateKey()
        {
            return privateKey;
        }

        /**
         * Sets the private key for the keystore entry.
         */
        void setPrivateKey(RSAPrivateCrtKey key)
            throws InvalidKeyException, KeyStoreException
        {
            byte[] modulusBytes = key.getModulus().toByteArray();

            // Adjust key length due to sign bit
            int keyBitLength = (modulusBytes[0] == 0)
                ? (modulusBytes.length - 1) * 8
                : modulusBytes.length * 8;

            byte[] keyBlob = generatePrivateKeyBlob(
                keyBitLength,
                modulusBytes,
                key.getPublicExponent().toByteArray(),
                key.getPrivateExponent().toByteArray(),
                key.getPrimeP().toByteArray(),
                key.getPrimeQ().toByteArray(),
                key.getPrimeExponentP().toByteArray(),
                key.getPrimeExponentQ().toByteArray(),
                key.getCrtCoefficient().toByteArray());

            privateKey = storePrivateKey(keyBlob,
                "{" + UUID.randomUUID().toString() + "}", keyBitLength);
        }

        /**
         * Gets the certificate chain for the keystore entry.
         */
        X509Certificate[] getCertificateChain()
        {
            return certChain;
        }

        /**
         * Sets the certificate chain for the keystore entry.
         */
        void setCertificateChain(X509Certificate[] chain)
            throws CertificateException, KeyStoreException
        {
            for (int i = 0; i < chain.length; i++) {
                byte[] encoding = chain[i].getEncoded();
                if (i == 0 && privateKey != null) {
                    storeCertificate(getName(), alias, encoding,
                        encoding.length, privateKey.getHCryptProvider(),
                        privateKey.getHCryptKey());

                } else {
                    storeCertificate(getName(), alias, encoding,
                        encoding.length, 0L, 0L); // no private key to attach
                }
            }
            certChain = chain;
        }
    };

    /*
     * An X.509 certificate factory.
     * Used to create an X.509 certificate from its DER-encoding.
     */
    private CertificateFactory certificateFactory = null;

    /*
     * Compatibility mode: for applications that assume keystores are
     * stream-based this mode tolerates (but ignores) a non-null stream
     * or password parameter when passed to the load or store methods.
     * The mode is enabled by default.
     */
    private static final String KEYSTORE_COMPATIBILITY_MODE_PROP =
        "sun.security.mscapi.keyStoreCompatibilityMode";
    private final boolean keyStoreCompatibilityMode;

    /*
     * The keystore entries.
     */
    private Collection<KeyEntry> entries = new ArrayList<KeyEntry>();

    /*
     * The keystore name.
     * Case is not significant.
     */
    private final String storeName;

    KeyStore(String storeName) {
        // Get the compatibility mode
        String prop =
            AccessController.doPrivileged(
                new GetPropertyAction(KEYSTORE_COMPATIBILITY_MODE_PROP));

        if ("false".equalsIgnoreCase(prop)) {
            keyStoreCompatibilityMode = false;
        } else {
            keyStoreCompatibilityMode = true;
        }

        this.storeName = storeName;
    }

    /**
     * Returns the key associated with the given alias.
     * <p>
     * A compatibility mode is supported for applications that assume
     * a password must be supplied. It permits (but ignores) a non-null
     * <code>password</code>.  The mode is enabled by default.
     * Set the
     * <code>sun.security.mscapi.keyStoreCompatibilityMode</code>
     * system property to <code>false</code> to disable compatibility mode
     * and reject a non-null <code>password</code>.
     *
     * @param alias the alias name
     * @param password the password, which should be <code>null</code>
     *
     * @return the requested key, or null if the given alias does not exist
     * or does not identify a <i>key entry</i>.
     *
     * @exception NoSuchAlgorithmException if the algorithm for recovering the
     * key cannot be found,
     * or if compatibility mode is disabled and <code>password</code> is
     * non-null.
     * @exception UnrecoverableKeyException if the key cannot be recovered.
     */
    public java.security.Key engineGetKey(String alias, char[] password)
        throws NoSuchAlgorithmException, UnrecoverableKeyException
    {
        if (alias == null) {
            return null;
        }

        if (password != null && !keyStoreCompatibilityMode) {
            throw new UnrecoverableKeyException("Password must be null");
        }

        if (engineIsKeyEntry(alias) == false)
            return null;

        for (KeyEntry entry : entries) {
            if (alias.equals(entry.getAlias())) {
                return entry.getPrivateKey();
            }
        }

        return null;
    }

    /**
     * Returns the certificate chain associated with the given alias.
     *
     * @param alias the alias name
     *
     * @return the certificate chain (ordered with the user's certificate first
     * and the root certificate authority last), or null if the given alias
     * does not exist or does not contain a certificate chain (i.e., the given
     * alias identifies either a <i>trusted certificate entry</i> or a
     * <i>key entry</i> without a certificate chain).
     */
    public Certificate[] engineGetCertificateChain(String alias)
    {
        if (alias == null) {
            return null;
        }

        for (KeyEntry entry : entries) {
            if (alias.equals(entry.getAlias())) {
                X509Certificate[] certChain = entry.getCertificateChain();

                return certChain.clone();
            }
        }

        return null;
    }

    /**
     * Returns the certificate associated with the given alias.
     *
     * <p>If the given alias name identifies a
     * <i>trusted certificate entry</i>, the certificate associated with that
     * entry is returned. If the given alias name identifies a
     * <i>key entry</i>, the first element of the certificate chain of that
     * entry is returned, or null if that entry does not have a certificate
     * chain.
     *
     * @param alias the alias name
     *
     * @return the certificate, or null if the given alias does not exist or
     * does not contain a certificate.
     */
    public Certificate engineGetCertificate(String alias)
    {
        if (alias == null) {
            return null;
        }

        for (KeyEntry entry : entries) {
            if (alias.equals(entry.getAlias()))
            {
                X509Certificate[] certChain = entry.getCertificateChain();
                return certChain[0];
            }
        }

        return null;
    }

    /**
     * Returns the creation date of the entry identified by the given alias.
     *
     * @param alias the alias name
     *
     * @return the creation date of this entry, or null if the given alias does
     * not exist
     */
    public Date engineGetCreationDate(String alias) {
        if (alias == null) {
            return null;
        }
        return new Date();
    }

    /**
     * Stores the given private key and associated certificate chain in the
     * keystore.
     *
     * <p>The given java.security.PrivateKey <code>key</code> must
     * be accompanied by a certificate chain certifying the
     * corresponding public key.
     *
     * <p>If the given alias already exists, the keystore information
     * associated with it is overridden by the given key and certificate
     * chain. Otherwise, a new entry is created.
     *
     * <p>
     * A compatibility mode is supported for applications that assume
     * a password must be supplied. It permits (but ignores) a non-null
     * <code>password</code>.  The mode is enabled by default.
     * Set the
     * <code>sun.security.mscapi.keyStoreCompatibilityMode</code>
     * system property to <code>false</code> to disable compatibility mode
     * and reject a non-null <code>password</code>.
     *
     * @param alias the alias name
     * @param key the private key to be associated with the alias
     * @param password the password, which should be <code>null</code>
     * @param chain the certificate chain for the corresponding public
     *        key (only required if the given key is of type
     *        <code>java.security.PrivateKey</code>).
     *
     * @exception KeyStoreException if the given key is not a private key,
     * cannot be protected, or if compatibility mode is disabled and
     * <code>password</code> is non-null, or if this operation fails for
     * some other reason.
     */
    public void engineSetKeyEntry(String alias, java.security.Key key,
        char[] password, Certificate[] chain) throws KeyStoreException
    {
        if (alias == null) {
            throw new KeyStoreException("alias must not be null");
        }

        if (password != null && !keyStoreCompatibilityMode) {
            throw new KeyStoreException("Password must be null");
        }

        if (key instanceof RSAPrivateCrtKey) {

            KeyEntry entry = null;
            boolean found = false;

            for (KeyEntry e : entries) {
                if (alias.equals(e.getAlias())) {
                    found = true;
                    entry = e;
                    break;
                }
            }

            if (! found) {
                entry =
                    //TODO new KeyEntry(alias, key, (X509Certificate[]) chain);
                    new KeyEntry(alias, null, (X509Certificate[]) chain);
                entries.add(entry);
            }

            entry.setAlias(alias);

            try {
                entry.setPrivateKey((RSAPrivateCrtKey) key);
                entry.setCertificateChain((X509Certificate[]) chain);

            } catch (CertificateException ce) {
                throw new KeyStoreException(ce);

            } catch (InvalidKeyException ike) {
                throw new KeyStoreException(ike);
            }

        } else {
            throw new UnsupportedOperationException(
                "Cannot assign the key to the given alias.");
        }
    }

    /**
     * Assigns the given key (that has already been protected) to the given
     * alias.
     *
     * <p>If the protected key is of type
     * <code>java.security.PrivateKey</code>, it must be accompanied by a
     * certificate chain certifying the corresponding public key. If the
     * underlying keystore implementation is of type <code>jks</code>,
     * <code>key</code> must be encoded as an
     * <code>EncryptedPrivateKeyInfo</code> as defined in the PKCS #8 standard.
     *
     * <p>If the given alias already exists, the keystore information
     * associated with it is overridden by the given key (and possibly
     * certificate chain).
     *
     * @param alias the alias name
     * @param key the key (in protected format) to be associated with the alias
     * @param chain the certificate chain for the corresponding public
     * key (only useful if the protected key is of type
     * <code>java.security.PrivateKey</code>).
     *
     * @exception KeyStoreException if this operation fails.
     */
    public void engineSetKeyEntry(String alias, byte[] key,
                                  Certificate[] chain)
        throws KeyStoreException
    {
        throw new UnsupportedOperationException(
            "Cannot assign the encoded key to the given alias.");
    }

    /**
     * Assigns the given certificate to the given alias.
     *
     * <p>If the given alias already exists in this keystore and identifies a
     * <i>trusted certificate entry</i>, the certificate associated with it is
     * overridden by the given certificate.
     *
     * @param alias the alias name
     * @param cert the certificate
     *
     * @exception KeyStoreException if the given alias already exists and does
     * not identify a <i>trusted certificate entry</i>, or this operation
     * fails for some other reason.
     */
    public void engineSetCertificateEntry(String alias, Certificate cert)
        throws KeyStoreException
    {
        if (alias == null) {
            throw new KeyStoreException("alias must not be null");
        }

        if (cert instanceof X509Certificate) {

            // TODO - build CryptoAPI chain?
            X509Certificate[] chain =
                new X509Certificate[]{ (X509Certificate) cert };
            KeyEntry entry = null;
            boolean found = false;

            for (KeyEntry e : entries) {
                if (alias.equals(e.getAlias())) {
                    found = true;
                    entry = e;
                    break;
                }
            }

            if (! found) {
                entry =
                    new KeyEntry(alias, null, chain);
                entries.add(entry);

            }
            if (entry.getPrivateKey() == null) { // trusted-cert entry
                entry.setAlias(alias);

                try {
                    entry.setCertificateChain(chain);

                } catch (CertificateException ce) {
                    throw new KeyStoreException(ce);
                }
            }

        } else {
            throw new UnsupportedOperationException(
                "Cannot assign the certificate to the given alias.");
        }
    }

    /**
     * Deletes the entry identified by the given alias from this keystore.
     *
     * @param alias the alias name
     *
     * @exception KeyStoreException if the entry cannot be removed.
     */
    public void engineDeleteEntry(String alias)
        throws KeyStoreException
    {
        if (alias == null) {
            throw new KeyStoreException("alias must not be null");
        }

        for (KeyEntry entry : entries) {
            if (alias.equals(entry.getAlias())) {

                // Get end-entity certificate and remove from system cert store
                X509Certificate[] certChain = entry.getCertificateChain();
                if (certChain != null) {

                    try {

                        byte[] encoding = certChain[0].getEncoded();
                        removeCertificate(getName(), alias, encoding,
                            encoding.length);

                    } catch (CertificateException e) {
                        throw new KeyStoreException("Cannot remove entry: " +
                            e);
                    }
                }
                Key privateKey = entry.getPrivateKey();
                if (privateKey != null) {
                    destroyKeyContainer(
                        Key.getContainerName(privateKey.getHCryptProvider()));
                }

                entries.remove(entry);
                break;
            }
        }
    }

    /**
     * Lists all the alias names of this keystore.
     *
     * @return enumeration of the alias names
     */
    public Enumeration<String> engineAliases() {

        final Iterator<KeyEntry> iter = entries.iterator();

        return new Enumeration<String>()
        {
            public boolean hasMoreElements()
            {
                return iter.hasNext();
            }

            public String nextElement()
            {
                KeyEntry entry = iter.next();
                return entry.getAlias();
            }
        };
    }

    /**
     * Checks if the given alias exists in this keystore.
     *
     * @param alias the alias name
     *
     * @return true if the alias exists, false otherwise
     */
    public boolean engineContainsAlias(String alias) {
        for (Enumeration<String> enumerator = engineAliases();
            enumerator.hasMoreElements();)
        {
            String a = enumerator.nextElement();

            if (a.equals(alias))
                return true;
        }
        return false;
    }

    /**
     * Retrieves the number of entries in this keystore.
     *
     * @return the number of entries in this keystore
     */
    public int engineSize() {
        return entries.size();
    }

    /**
     * Returns true if the entry identified by the given alias is a
     * <i>key entry</i>, and false otherwise.
     *
     * @return true if the entry identified by the given alias is a
     * <i>key entry</i>, false otherwise.
     */
    public boolean engineIsKeyEntry(String alias) {

        if (alias == null) {
            return false;
        }

        for (KeyEntry entry : entries) {
            if (alias.equals(entry.getAlias())) {
                return entry.getPrivateKey() != null;
            }
        }

        return false;
    }

    /**
     * Returns true if the entry identified by the given alias is a
     * <i>trusted certificate entry</i>, and false otherwise.
     *
     * @return true if the entry identified by the given alias is a
     * <i>trusted certificate entry</i>, false otherwise.
     */
    public boolean engineIsCertificateEntry(String alias)
    {
        for (KeyEntry entry : entries) {
            if (alias.equals(entry.getAlias())) {
                return entry.getPrivateKey() == null;
            }
        }

        return false;
    }

    /**
     * Returns the (alias) name of the first keystore entry whose certificate
     * matches the given certificate.
     *
     * <p>This method attempts to match the given certificate with each
     * keystore entry. If the entry being considered
     * is a <i>trusted certificate entry</i>, the given certificate is
     * compared to that entry's certificate. If the entry being considered is
     * a <i>key entry</i>, the given certificate is compared to the first
     * element of that entry's certificate chain (if a chain exists).
     *
     * @param cert the certificate to match with.
     *
     * @return the (alias) name of the first entry with matching certificate,
     * or null if no such entry exists in this keystore.
     */
    public String engineGetCertificateAlias(Certificate cert)
    {
        for (KeyEntry entry : entries) {
            if (entry.certChain != null && entry.certChain[0].equals(cert)) {
                return entry.getAlias();
            }
        }

        return null;
    }

    /**
     * engineStore is currently a no-op.
     * Entries are stored during engineSetEntry.
     *
     * A compatibility mode is supported for applications that assume
     * keystores are stream-based. It permits (but ignores) a non-null
     * <code>stream</code> or <code>password</code>.
     * The mode is enabled by default.
     * Set the
     * <code>sun.security.mscapi.keyStoreCompatibilityMode</code>
     * system property to <code>false</code> to disable compatibility mode
     * and reject a non-null <code>stream</code> or <code>password</code>.
     *
     * @param stream the output stream, which should be <code>null</code>
     * @param password the password, which should be <code>null</code>
     *
     * @exception IOException if compatibility mode is disabled and either
     * parameter is non-null.
     */
    public void engineStore(OutputStream stream, char[] password)
        throws IOException, NoSuchAlgorithmException, CertificateException
    {
        if (stream != null && !keyStoreCompatibilityMode) {
            throw new IOException("Keystore output stream must be null");
        }

        if (password != null && !keyStoreCompatibilityMode) {
            throw new IOException("Keystore password must be null");
        }
    }

    /**
     * Loads the keystore.
     *
     * A compatibility mode is supported for applications that assume
     * keystores are stream-based. It permits (but ignores) a non-null
     * <code>stream</code> or <code>password</code>.
     * The mode is enabled by default.
     * Set the
     * <code>sun.security.mscapi.keyStoreCompatibilityMode</code>
     * system property to <code>false</code> to disable compatibility mode
     * and reject a non-null <code>stream</code> or <code>password</code>.
     *
     * @param stream the input stream, which should be <code>null</code>.
     * @param password the password, which should be <code>null</code>.
     *
     * @exception IOException if there is an I/O or format problem with the
     * keystore data. Or if compatibility mode is disabled and either
     * parameter is non-null.
     * @exception NoSuchAlgorithmException if the algorithm used to check
     * the integrity of the keystore cannot be found
     * @exception CertificateException if any of the certificates in the
     * keystore could not be loaded
     * @exception SecurityException if the security check for
     *  <code>SecurityPermission("authProvider.<i>name</i>")</code> does not
     *  pass, where <i>name</i> is the value returned by
     *  this provider's <code>getName</code> method.
     */
    public void engineLoad(InputStream stream, char[] password)
        throws IOException, NoSuchAlgorithmException, CertificateException
    {
        if (stream != null && !keyStoreCompatibilityMode) {
            throw new IOException("Keystore input stream must be null");
        }

        if (password != null && !keyStoreCompatibilityMode) {
            throw new IOException("Keystore password must be null");
        }

        /*
         * Use the same security check as AuthProvider.login
         */
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            sm.checkPermission(new SecurityPermission(
                "authProvider.SunMSCAPI"));
        }

        // Clear all key entries
        entries.clear();

        try {

            // Load keys and/or certificate chains
            loadKeysOrCertificateChains(getName(), entries);

        } catch (KeyStoreException e) {
            throw new IOException(e);
        }
    }

    /**
     * Generates a certificate chain from the collection of
     * certificates and stores the result into a key entry.
     */
    private void generateCertificateChain(String alias,
        Collection<? extends Certificate> certCollection,
        Collection<KeyEntry> entries)
    {
        try
        {
            X509Certificate[] certChain =
                new X509Certificate[certCollection.size()];

            int i = 0;
            for (Iterator<? extends Certificate> iter =
                    certCollection.iterator(); iter.hasNext(); i++)
            {
                certChain[i] = (X509Certificate) iter.next();
            }

            KeyEntry entry = new KeyEntry(alias, null, certChain);

            // Add cert chain
            entries.add(entry);
        }
        catch (Throwable e)
        {
            // Ignore the exception and skip this entry
            // TODO - throw CertificateException?
        }
    }

    /**
     * Generates RSA key and certificate chain from the private key handle,
     * collection of certificates and stores the result into key entries.
     */
    private void generateRSAKeyAndCertificateChain(String alias,
        long hCryptProv, long hCryptKey, int keyLength,
        Collection<? extends Certificate> certCollection,
        Collection<KeyEntry> entries)
    {
        try
        {
            X509Certificate[] certChain =
                new X509Certificate[certCollection.size()];

            int i = 0;
            for (Iterator<? extends Certificate> iter =
                    certCollection.iterator(); iter.hasNext(); i++)
            {
                certChain[i] = (X509Certificate) iter.next();
            }

            KeyEntry entry = new KeyEntry(alias, new RSAPrivateKey(hCryptProv,
                hCryptKey, keyLength), certChain);

            // Add cert chain
            entries.add(entry);
        }
        catch (Throwable e)
        {
            // Ignore the exception and skip this entry
            // TODO - throw CertificateException?
        }
    }

    /**
     * Generates certificates from byte data and stores into cert collection.
     *
     * @param data Byte data.
     * @param certCollection Collection of certificates.
     */
    private void generateCertificate(byte[] data,
        Collection<Certificate> certCollection) {
        try
        {
            ByteArrayInputStream bis = new ByteArrayInputStream(data);

            // Obtain certificate factory
            if (certificateFactory == null) {
                certificateFactory = CertificateFactory.getInstance("X.509");
            }

            // Generate certificate
            Collection<? extends Certificate> c =
                    certificateFactory.generateCertificates(bis);
            certCollection.addAll(c);
        }
        catch (CertificateException e)
        {
            // Ignore the exception and skip this certificate
            // TODO - throw CertificateException?
        }
        catch (Throwable te)
        {
            // Ignore the exception and skip this certificate
            // TODO - throw CertificateException?
        }
    }

    /**
     * Returns the name of the keystore.
     */
    private String getName()
    {
        return storeName;
    }

    /**
     * Load keys and/or certificates from keystore into Collection.
     *
     * @param name Name of keystore.
     * @param entries Collection of key/certificate.
     */
    private native void loadKeysOrCertificateChains(String name,
        Collection<KeyEntry> entries) throws KeyStoreException;

    /**
     * Stores a DER-encoded certificate into the certificate store
     *
     * @param name Name of the keystore.
     * @param alias Name of the certificate.
     * @param encoding DER-encoded certificate.
     */
    private native void storeCertificate(String name, String alias,
        byte[] encoding, int encodingLength, long hCryptProvider,
        long hCryptKey) throws CertificateException, KeyStoreException;

    /**
     * Removes the certificate from the certificate store
     *
     * @param name Name of the keystore.
     * @param alias Name of the certificate.
     * @param encoding DER-encoded certificate.
     */
    private native void removeCertificate(String name, String alias,
        byte[] encoding, int encodingLength)
            throws CertificateException, KeyStoreException;

    /**
     * Destroys the key container.
     *
     * @param keyContainerName The name of the key container.
     */
    private native void destroyKeyContainer(String keyContainerName)
        throws KeyStoreException;

    /**
     * Generates a private-key BLOB from a key's components.
     */
    private native byte[] generatePrivateKeyBlob(
        int keyBitLength,
        byte[] modulus,
        byte[] publicExponent,
        byte[] privateExponent,
        byte[] primeP,
        byte[] primeQ,
        byte[] exponentP,
        byte[] exponentQ,
        byte[] crtCoefficient) throws InvalidKeyException;

    private native RSAPrivateKey storePrivateKey(byte[] keyBlob,
        String keyContainerName, int keySize) throws KeyStoreException;
}
