package Multithreading;

class MyJoinThread2 extends Thread
{
      Thread t1;

      MyJoinThread2(Thread t1){
          this.t1=t1;
      }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            try {
                t1.join();  //means t2 thread will start after execution of t1 thread
            }
            catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Thread 2 starting...");
        }
    }
}

class MyJoinThread extends Thread   //t1 thread
{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Child Thread starting...");
            try {
               Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        MyJoinThread t1=new MyJoinThread();
        MyJoinThread2 t2=new MyJoinThread2(t1);
        t1.start();
        t2.start();
        t2.join();  //main thread will get executed only when t2 thread gets executed
        for (int i = 0; i <5 ; i++) {
            System.out.println("Main Thread");
        }
    }
}


/**
Output:

Child Thread starting...
Child Thread starting...
Child Thread starting...
Child Thread starting...
Child Thread starting...
Thread 2 starting...
Thread 2 starting...
Thread 2 starting...
Thread 2 starting...
Thread 2 starting...
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread

 **/




