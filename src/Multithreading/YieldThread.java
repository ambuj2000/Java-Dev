package Multithreading;

class MyYieldThread extends Thread
{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            //yield is used to give up the cpu temporarily
            //note but we cannot be sure for how much time will yield pause the thread
            //so thats why to make sure we use thread sleep
            Thread.yield();
            try {
               Thread.sleep(2000);
            }
            catch (Exception e){

                e.printStackTrace();
            }

            System.out.println("Child Thread Job..."+i);
        }
    }
}

public class YieldThread {
    public static void main(String[] args) {

        MyYieldThread t1=new MyYieldThread();
        t1.start();
        for (int i=0;i<5;i++){
            System.out.println("Main Thread..."+i);
        }
    }
}

//Output:

//Main Thread...0
//Main Thread...1
//Main Thread...2
//Main Thread...3
//Main Thread...4
//Child Thread Job...0
//Child Thread Job...1
//Child Thread Job...2
//Child Thread Job...3
//Child Thread Job...4
