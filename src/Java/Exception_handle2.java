package Java;

public class Exception_handle2 {
    public static void main(String[] args) {
        System.out.println("Main Method");

        try {
            System.out.println("inside try");
            System.out.println(10/0);
        }
        catch (ArithmeticException e)  //child exception
        {
            System.out.println("ArithmeticException");
        }

        catch (Exception e){ //parent exception niche hona chaiye and child exception uppar
            System.out.println("Exception");
        }
        finally {
            System.out.println("Main hu Done");
        }
    }
}
