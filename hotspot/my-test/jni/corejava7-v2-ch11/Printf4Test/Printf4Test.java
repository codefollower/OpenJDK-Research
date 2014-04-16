/**
   @version 1.10 1997-07-01
   @author Cay Horstmann
*/

import java.io.*;

class Printf4Test
{  
   public static void main(String[] args)
   {  
      double price = 44.95;
      double tax = 7.75;
      double amountDue = price * (1 + tax / 100);
      PrintWriter out = new PrintWriter(System.out);
      /* This call will throw an exception--note the %% */
      Printf4.fprint(out, "Amount due = %%8.2f\n", amountDue);
      out.flush();
   }
}
