package JavaBasics.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
FOCUS: insertion order, duplicate value, null value, when to use
 */

public class ListDemo {
    public static void main(String[] args) {
//        List<String> fruits = new ArrayList<>();
        List<String> fruits = new LinkedList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Litchi");

//        System.out.println(fruits);

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
            fruits.add("Watermelon");    // throw ConcurrentModificationException
//            System.out.println(next);
        }
    }
}
