package JavaBasics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
//        Set<Integer> ages = new HashSet<>();
        Set<Integer> ages = new TreeSet<>();
        ages.add(1);
        ages.add(5);
        ages.add(10);
        ages.add(2);
        ages.add(4);
        ages.add(10);

        System.out.println(ages);
    }
}
