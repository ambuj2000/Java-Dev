package Multithreading;

//2nd way of creating thread is by implementing Runnable interface

class Demo2 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Jai Shri Ram...");
        }
    }
}

public class threading2 {
    public static void main(String[] args) {
        Demo2 d=new Demo2();
        Thread t1=new Thread(d);
        t1.start();

        for(int i=0;i<10;i++){
            System.out.println("Main");
        }
    }
}

//Demo2->Runnable    (directly implements runnable ) so it is better than extending Thread class