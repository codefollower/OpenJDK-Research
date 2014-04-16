/**
   @version 1.10 1997-07-01
   @author Cay Horstmann
*/

import java.io.*;

class Printf3
{ 
   public static native void fprint(PrintWriter out, String format, double x);
   
   static
   {  
      System.loadLibrary("Printf3");
   }
}

