import java.lang.reflect.Field;

public class ApiTest {
    public int f1;
    public int f2;

    public void run() {
        //System.out.println("f1 = " + f1);
        //System.out.println("f2 = " + f2);
    }
    
    private static class ApiException extends Exception{
        
    }

    public static void main(String[] args) throws Exception {

        ApiTest c = new ApiTest();
        //c.f1 = 10;
        //c.f2 = c.f1;
        c.run();

        Field f1 = ApiTest.class.getField("f1");
        f1.setInt(c, 100);
        Field f2 = ApiTest.class.getField("f2");
        f2.setInt(c, 200);

        c.run();
        throw new ApiException();
    }
}
