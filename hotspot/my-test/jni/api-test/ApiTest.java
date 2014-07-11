import java.io.*;

public class ApiTest {
    static {
        System.loadLibrary("ApiTest");
    }

    public static native void fprint(PrintWriter ps, String format, double x);

    public static native void nativeMainMethod();

    public static void main(String[] args) {
		System.out.println(System.getProperty("sun.boot.library.path"));
		System.out.println(System.getProperty("sun.boot.class.path"));
		System.out.println(System.getProperty("java.library.path"));

        ApiTest.nativeMainMethod();

        double price = 44.95;
        double tax = 7.75;
        double amountDue = price * (1 + tax / 100);
        PrintWriter out = new PrintWriter(System.out);
        /* This call will throw an exception--note the %% */
        //ApiTest.fprint(out, "Amount due = %%8.2f\n", amountDue);
        //out.flush();

        objectArrayTest();
    }

    private static native int[][] initInt2DArray(int size);

    public static void objectArrayTest() {
        int[][] i2arr = initInt2DArray(3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + i2arr[i][j]);
            }
            System.out.println();
        }
    }

}
