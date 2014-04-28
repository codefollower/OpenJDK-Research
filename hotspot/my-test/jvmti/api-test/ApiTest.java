import java.lang.reflect.Field;

public class ApiTest {

    //确保在java代码层和jvmti或jni层在打印输出时不会错乱。
    //jvmti或jni层也用这个字段来同步
    private static Object outLock = new Object();

    private static class ApiException extends Exception {
    }

    //测试MonitorContendedEnter和MonitorContendedEntered
    //    private static class MyThread extends Thread {
    //        static Object lock = new Object();
    //        int count;
    //
    //        public MyThread(String name, int count) {
    //            setName(name);
    //            this.count = count;
    //        }
    //
    //        public void run() {
    //            while (--count != 0) {
    //                synchronized (lock) {
    //                    try {
    //                        System.out.println(getName() + ": count =  " + count);
    //                        sleep(1000);
    //                    } catch (InterruptedException e) {
    //                        e.printStackTrace();
    //                    }
    //                }
    //            }
    //        }
    //    }

    private static enum Type {
        PRODUCER, CONSUMER
    }

    private static Type type = Type.PRODUCER; //先确保Producer总是优先运行
    private static Object typeLock = new Object();

    private static class Producer extends Thread {
        int count;

        public Producer(int count) {
            setName("Producer");
            this.count = count;
        }

        public void run() {
            while (count-- != 0) {
                synchronized (typeLock) {
                    try {
                        if (type == Type.PRODUCER) {
                            type = Type.CONSUMER;
                            typeLock.notifyAll();
                        } else {
                            synchronized (outLock) {
                                //System.out.println(getName() + " waiting...");
                                System.out.printf("%-15s: waiting...\n", getName());
                            }
                            typeLock.wait();
                        }
                        synchronized (outLock) {
                            //System.out.printf(getName() + ": count =  " + count);
                            System.out.printf("%-15s: count = %d\n", getName(), count);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            //Producer运行结束后要通知Consumer，
            //否则Consumer一直在等，导致Consumer无法退出
            synchronized (typeLock) {
                type = Type.CONSUMER;
                typeLock.notifyAll();
            }
        }
    }

    private static class Consumer extends Thread {
        int count;

        public Consumer(int count) {
            setName("Consumer");
            this.count = count;
        }

        public void run() {
            while (count-- != 0) {
                synchronized (typeLock) {
                    try {
                        if (type == Type.CONSUMER) {
                            type = Type.PRODUCER;
                            typeLock.notifyAll();
                        } else {
                            synchronized (outLock) {
                                //System.out.println(getName() + " waiting...");
                                System.out.printf("%-15s: waiting...\n", getName());
                            }
                            typeLock.wait();
                        }
                        synchronized (outLock) {
                            //System.out.printf(getName() + ": count =  " + count);
                            System.out.printf("%-15s: count = %d\n", getName(), count);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        new ApiTest().run();
    }

    public int f1;
    public int f2;

    public void run() throws Exception {
        //testWatchedField();
        testMonitor();
    }

    void println() {
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
    }

    void testWatchedField() throws Exception {
        f1 = 10;
        f2 = f1;
        println();

        Field f1 = ApiTest.class.getField("f1");
        f1.setInt(this, 100);
        Field f2 = ApiTest.class.getField("f2");
        f2.setInt(this, 200);

        println();
        throw new ApiException();
    }

    void testMonitor() throws Exception {
        int count = 3;
        //Thread t1 = new MyThread("ApiTest Thread 1", count);
        //Thread t2 = new MyThread("ApiTest Thread 2", count);
        Thread t1 = new Producer(count);
        Thread t2 = new Consumer(count);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

}
