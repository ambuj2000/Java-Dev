package Java;

public class ThrowsDemo {
    // in throws the caller method handle exception using try, catch block
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main");

        m1();



    }


    public static void m1() throws InterruptedException {
        System.out.println("m1");

        m2();
    }
    public static void m2() throws InterruptedException {
        System.out.println("m2");
        m3();
    }
    public static void m3 () throws InterruptedException {
        System.out.println("m3");

        Thread.sleep(3000);
        System.out.println("main hu m3");
        System.out.println("Genie Ashwani");
    }
}
