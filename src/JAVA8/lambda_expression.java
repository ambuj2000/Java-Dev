package JAVA8;

interface Runnable{
    public void run();
}

public class lambda_expression {
    public static void main(String[] args) {
        int speed = 100;

        // new approach (lambda expression) to implement
        Runnable r = () -> {
            System.out.println("Running at the speed of " + speed);
        };
        r.run();
    }
}
//        () -> System.out.println("executing lambda expression."); // zero argument, lambda expression

//        (String str) -> System.out.print(str); // single argumment, lambda expression
//
//        (int a, int b) -> a+b; // multiple arguments, sum of two values
//
//        (a,b) -> a+b // parameters without types, can be used to sum and concat two strings as well.
//
//                (int a, int b) -> return (a+b); // lambda expression with return statement
//
//        (int[]) -> { multiple statments; return index; }   // it can have multiple statements




//        interface Runnable{
//            public void run();
//        }
//        public class Demo {
//            public static void main(String[] args) {
//                int speed=100;
//
//                // old approach to implement(without lambda expression)
//                Runnable r=new Runnable(){
//                    public void run(){System.out.println("Running at the speed of "+speed);}
//                };
//                r.run();
//            }
//        }


