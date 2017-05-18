/*
 * Copyright (c) 2003, 2013, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.crypto.provider;

import java.util.Arrays;
import java.nio.ByteBuffer;

import javax.crypto.MacSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.security.*;
import java.security.spec.*;

/**
 * This is an implementation of the HMAC-PBESHA1 algorithm as defined
 * in PKCS#12 v1.0 standard.
 *
 * @author Valerie Peng
 */
public final class HmacPKCS12PBESHA1 extends HmacCore {

    /**
     * Standard constructor, creates a new HmacSHA1 instance.
     */
    public HmacPKCS12PBESHA1() throws NoSuchAlgorithmException {
        super("SHA1", 64);
    }

    /**
     * Initializes the HMAC with the given secret key and algorithm parameters.
     *
     * @param key the secret key.
     * @param params the algorithm parameters.
     *
     * @exception InvalidKeyException if the given key is inappropriate for
     * initializing this MAC.
     * @exception InvalidAlgorithmParameterException if the given algorithm
     * parameters are inappropriate for this MAC.
     */
    protected void engineInit(Key key, AlgorithmParameterSpec params)
        throws InvalidKeyException, InvalidAlgorithmParameterException {
        char[] passwdChars;
        byte[] salt = null;
        int iCount = 0;
        if (key instanceof javax.crypto.interfaces.PBEKey) {
            javax.crypto.interfaces.PBEKey pbeKey =
                (javax.crypto.interfaces.PBEKey) key;
            passwdChars = pbeKey.getPassword();
            salt = pbeKey.getSalt(); // maybe null if unspecified
            iCount = pbeKey.getIterationCount(); // maybe 0 if unspecified
        } else if (key instanceof SecretKey) {
            byte[] passwdBytes = key.getEncoded();
            if ((passwdBytes == null) ||
                !(key.getAlgorithm().regionMatches(true, 0, "PBE", 0, 3))) {
                throw new InvalidKeyException("Missing password");
            }
            passwdChars = new char[passwdBytes.length];
            for (int i=0; i<passwdChars.length; i++) {
                passwdChars[i] = (char) (passwdBytes[i] & 0x7f);
            }
        } else {
            throw new InvalidKeyException("SecretKey of PBE type required");
        }
        if (params == null) {
            // should not auto-generate default values since current
            // javax.crypto.Mac api does not have any method for caller to
            // retrieve the generated defaults.
            if ((salt == null) || (iCount == 0)) {
                throw new InvalidAlgorithmParameterException
                    ("PBEParameterSpec required for salt and iteration count");
            }
        } else if (!(params instanceof PBEParameterSpec)) {
            throw new InvalidAlgorithmParameterException
                ("PBEParameterSpec type required");
        } else {
            PBEParameterSpec pbeParams = (PBEParameterSpec) params;
            // make sure the parameter values are consistent
            if (salt != null) {
                if (!Arrays.equals(salt, pbeParams.getSalt())) {
                    throw new InvalidAlgorithmParameterException
                        ("Inconsistent value of salt between key and params");
                }
            } else {
                salt = pbeParams.getSalt();
            }
            if (iCount != 0) {
                if (iCount != pbeParams.getIterationCount()) {
                    throw new InvalidAlgorithmParameterException
                        ("Different iteration count between key and params");
                }
            } else {
                iCount = pbeParams.getIterationCount();
            }
        }
        // For security purpose, we need to enforce a minimum length
        // for salt; just require the minimum salt length to be 8-byte
        // which is what PKCS#5 recommends and openssl does.
        if (salt.length < 8) {
            throw new InvalidAlgorithmParameterException
                ("Salt must be at least 8 bytes long");
        }
        if (iCount <= 0) {
            throw new InvalidAlgorithmParameterException
                ("IterationCount must be a positive number");
        }
        byte[] derivedKey = PKCS12PBECipherCore.derive(passwdChars, salt,
            iCount, engineGetMacLength(), PKCS12PBECipherCore.MAC_KEY);
        SecretKey cipherKey = new SecretKeySpec(derivedKey, "HmacSHA1");
        super.engineInit(cipherKey, null);
    }
}
