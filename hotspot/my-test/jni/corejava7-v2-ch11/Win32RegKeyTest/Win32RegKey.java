/**
   @version 1.00 1997-07-01
   @author Cay Horstmann
*/

import java.util.*;

/**
   A Win32RegKey object can be used to get and set values of
   a registry key in the Windows registry.
*/
public class Win32RegKey
{
   /**
      Construct a registry key object.
      @param theRoot one of HKEY_CLASSES_ROOT, HKEY_CURRENT_USER,
      HKEY_LOCAL_MACHINE, HKEY_USERS, HKEY_CURRENT_CONFIG,
      HKEY_DYN_DATA
      @param thePath the registry key path
   */
   public Win32RegKey(int theRoot, String thePath)
   {  
      root = theRoot;
      path = thePath;
   }

   /**
      Enumerates all names of registry entries under the path
      that this object describes.
      @return an enumeration listing all entry names
   */
   public Enumeration<String> names()
   {  
      return new Win32RegKeyNameEnumeration(root, path);
   }

   /**
      Gets the value of a registry entry.
      @param name the entry name
      @return the associated value
   */
   public native Object getValue(String name);

   /**
      Sets the value of a registry entry.
      @param name the entry name
      @param value the new value
   */
   public native void setValue(String name, Object value);

   public static final int HKEY_CLASSES_ROOT = 0x80000000;
   public static final int HKEY_CURRENT_USER = 0x80000001;
   public static final int HKEY_LOCAL_MACHINE = 0x80000002;
   public static final int HKEY_USERS = 0x80000003;
   public static final int HKEY_CURRENT_CONFIG = 0x80000005;
   public static final int HKEY_DYN_DATA = 0x80000006;

   private int root;
   private String path;

   static
   {  
      System.loadLibrary("Win32RegKey");
   }
}

class Win32RegKeyNameEnumeration implements Enumeration<String>
{  
   Win32RegKeyNameEnumeration(int theRoot, String thePath)
   {  
      root = theRoot;
      path = thePath;
   }

   public native String nextElement();
   public native boolean hasMoreElements();

   private int root;
   private String path;
   private int index = -1;
   private int hkey = 0;
   private int maxsize;
   private int count;
}

class Win32RegKeyException extends RuntimeException
{  
   public Win32RegKeyException() {}
   public Win32RegKeyException(String why)
   {  
      super(why);
   }
}
