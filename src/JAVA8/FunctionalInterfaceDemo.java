package JAVA8;

@FunctionalInterface
interface Ambuj
{
    public void m1();

    //override
    default void print()
    {
        System.out.println("default method");
    }

    //no override
    static void display()
    {
        System.out.println("static method");
    }

}

class MyThread implements Runnable
{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Job = "+i);
        }
    }
}

public class FunctionalInterfaceDemo implements Ambuj {

        public static void main(String[] args) {

            Ambuj i=()-> System.out.println("Main hu ambuj");

            Ambuj.display();
            i.m1();

            //MyThread myThread=new MyThread();
            Thread thread=new Thread(()->{
                for (int j = 0; j < 5; j++) {
                    System.out.println("Job = "+j);
                }
            });
            thread.start();
        }

        @Override
        public void m1() {

        }
    }

    //output:
//static method
//Main hu ambuj
//Job = 0
//Job = 1
//Job = 2
//Job = 3
//Job = 4