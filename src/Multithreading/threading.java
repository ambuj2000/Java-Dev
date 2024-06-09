package Multithreading;

//1st way of creating thread is by extending Thread class using extends keyword

class Demo extends Thread{
    @Override
    public void run() {
        //thread job
        for(int i=0;i<10;i++){
            System.out.println("Jai Shri Ram...");
        }
    }
}

public class threading {
    public static void main(String[] args) {
        Demo d = new Demo();//thread initialization
        d.start();
        for(int i=0;i<10;i++){
            System.out.println("Main");
        }
    }
}

//Demo->Thread->Runnable  (it extends Thread class which implements Runnable indirectly)