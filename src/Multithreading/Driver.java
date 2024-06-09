package Multithreading;

class ThreadDemo extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Ambuj Singh");
        }
    }
}

public class Driver {
    public static void main(String[] args) {

        //get and set names of thread
        System.out.println(Thread.currentThread().getName());// to check the name of the thread
        ThreadDemo t1=new ThreadDemo();// creating child thread
        System.out.println(t1.getName());//checking name of the thread
        Thread.currentThread().setName("Ambuj");//setting name of the thread
        System.out.println(Thread.currentThread().getName());


        //get and set priority
        System.out.println(Thread.currentThread().getPriority());//getting the priority of main thread
        System.out.println(t1.getPriority());//getting priority of child thread
        Thread.currentThread().setPriority(7);//setting priority of main thread
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(t1.getPriority());
        t1.setPriority(2);//setting priority of child thread
        System.out.println(t1.getPriority());
    }
}
