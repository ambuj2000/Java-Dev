package JAVA8;
import java.util.Collections;
import java.util.function.Function;

public class FunctionsDemo {
        public static void main(String[] args) {
            Function<String,Integer> f=(String s)->s.length();
            System.out.println(f.apply("Ambuj is Great"));

        }
    }
