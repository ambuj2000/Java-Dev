package Java;

public class CommandLineArgument {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int a= Integer.parseInt(args[0]);
        System.out.println("a = "+a);

        int b= Integer.parseInt(args[1]);
        System.out.println("b = "+b);

        int c= Integer.parseInt(args[2]);
        System.out.println("c = "+c);
    }
}
