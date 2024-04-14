package Java;

public class String_Builder {
    public static void main(String[] args) {
                //thread safe->multiple threads are allowed
                //StringBuilder-> when we want mutable String without thread safety then StringBuilder will be used
                //when we want mutable string with thread safety then StringBuffer will be used
                //When we want immutable string object then String should be used

                StringBuilder obj = new StringBuilder("welcome to ");
                obj.append("ambuj ");
                System.out.println(obj);

    }
}
