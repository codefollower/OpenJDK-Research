/**
   @version 1.10 1997-07-01
   @author Cay Horstmann
*/

class HelloNative
{  
   public static native void greeting();

   static
   {  
      System.loadLibrary("HelloNative");
   }
}


