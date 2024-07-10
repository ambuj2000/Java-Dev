package Multithreading;


class ThreadDemo1 extends Thread {
    int sum = 0;

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("Child thread start sum");
            for (int i = 0; i < 500; i++) {
                sum += i;
            }
            System.out.println("Child thread giving notification");
            this.notify();
        }
    }
}


public class InterCommDemo {

    public static void main(String[] args)throws InterruptedException {
        ThreadDemo1 t1=new ThreadDemo1();
        t1.start();
        synchronized (t1)
        {
            System.out.println("Main thread waiting for t1");
            t1.wait();
            System.out.println("Main thread get notification");
            System.out.println(t1.sum);

        }
    }

}
