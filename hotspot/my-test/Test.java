public class Test {

    public static void main(String[] args) {
		
        int i = 0;
        i++;

        System.out.println("test i=" + i);
        new MyThread().start();
    }
    
    static class MyThread extends Thread {
        public void run() {
            while(true) {
                System.out.println(new java.util.Date());
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
