package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        //order no
        //duplicate not allowed
//        Set<Integer> represents a set that can hold Integer objects. When you create
//        a HashSet using new HashSet<Integer>(),
//        it creates an instance of a HashSet that implements the Set<Integer> interface.
//     Set is an interface in Java that represents a collection that cannot contain duplicate elements.
//      It is part of the Java Collections Framework.
//      HashSet is a class in Java that implements the Set interface

        Set<Integer> set= new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println(set);
        System.out.println(set.remove(30));
    }
}
