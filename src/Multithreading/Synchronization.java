package Multithreading;

class PrintMsg
{
    public  void m1()
    {
        for (int i = 0; i < 5; i++) {


            synchronized (this) //locks this object
            {
                System.out.println("Executed by "+Thread.currentThread().getName());
                System.out.println("Hello Ambuj...");
            }
            try {
                Thread.sleep(100);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            System.out.println("By Ambuj..."+Thread.currentThread().getName());
        }
    }
}

class SynThreadDemo extends Thread
{
    PrintMsg p;
    SynThreadDemo(PrintMsg p)
    {
        this.p=p;
    }
    @Override
    public void run() {
        p.m1();
    }
}

public class Synchronization {
    //Thread safe-> when multiple objects/threads runs simultaneously then it
    // can lead to data inconsistency
    //this is the condition when thread is not safe and vice-versa


    public static void main(String[] args) {
        PrintMsg p=new PrintMsg();
        SynThreadDemo t1=new SynThreadDemo(p);
        SynThreadDemo t2=new SynThreadDemo(p);
        t1.setName("Ye Hai T1");
        t2.setName("Ye Hai T2");
        t1.start();
        t2.start();

    }
}



//Output

//Executed by Ye Hai T1
//Hello Ambuj...
//Executed by Ye Hai T2
//Hello Ambuj...
//By Ambuj...Ye Hai T1
//Executed by Ye Hai T1
//Hello Ambuj...
//By Ambuj...Ye Hai T2
//Executed by Ye Hai T2
//Hello Ambuj...
//By Ambuj...Ye Hai T2
//Executed by Ye Hai T2
//Hello Ambuj...
//By Ambuj...Ye Hai T1
//Executed by Ye Hai T1
//Hello Ambuj...
//By Ambuj...Ye Hai T1
//By Ambuj...Ye Hai T2
//Executed by Ye Hai T1
//Hello Ambuj...
//Executed by Ye Hai T2
//Hello Ambuj...
//By Ambuj...Ye Hai T1
//Executed by Ye Hai T1
//Hello Ambuj...
//By Ambuj...Ye Hai T2
//Executed by Ye Hai T2
//Hello Ambuj...
//By Ambuj...Ye Hai T2
//By Ambuj...Ye Hai T1
