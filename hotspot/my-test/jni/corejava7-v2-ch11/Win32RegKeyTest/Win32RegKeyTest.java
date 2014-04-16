/**
   @version 1.01 2001-08-30
   @author Cay Horstmann
*/

import java.util.*;

public class Win32RegKeyTest
{  
   public static void main(String[] args)
   {  
      Win32RegKey key = new Win32RegKey(
         Win32RegKey.HKEY_LOCAL_MACHINE, "SOFTWARE\\JavaSoft\\Java Development Kit\\1.8");

      //在Windows 7的开始->搜索输入栏中输入regedit，启动注册表，
      //会在HKEY_LOCAL_MACHINE\SOFTWARE\JavaSoft\Java Development Kit\1.8中生成下面三个key
      key.setValue("Default user", "Harry Hacker");
      key.setValue("Lucky number", new Integer(13));
      key.setValue("Small primes", new byte[] { 2, 3, 5, 7, 11 });

      Enumeration<String> e = key.names();

      while (e.hasMoreElements())
      {  
         String name = e.nextElement();
         System.out.print(name + "=");

         Object value = key.getValue(name);

         if (value instanceof byte[])
            for (byte b : (byte[]) value) System.out.print((b & 0xFF) + " ");
         else 
            System.out.print(value);

         System.out.println();
      }
   }
}
