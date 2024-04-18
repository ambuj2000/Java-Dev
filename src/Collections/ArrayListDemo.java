package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<Integer> ls=new ArrayList<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        System.out.println(ls);
        System.out.println(ls.get(2));
    }

}
