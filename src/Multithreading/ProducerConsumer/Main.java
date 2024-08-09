package Multithreading.ProducerConsumer;

public class Main {
    public static void main(String[] args) {

        Company comp=new Company();
        Producer p=new Producer(comp);
        Consumer c=new Consumer(comp);
        p.start();
        c.start();
    }
}

//Output:
//Produced : 1
//Consumed :1
//Produced : 2
//Consumed :2
//Produced : 3
//Consumed :3
//Produced : 4
//Consumed :4
//Produced : 5
//Consumed :5
//Produced : 6
//Consumed :6
//Produced : 7
//...continues untill broken
