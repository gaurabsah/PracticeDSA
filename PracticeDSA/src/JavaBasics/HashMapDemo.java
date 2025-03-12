package JavaBasics;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("one","Gaurab");
        map.put("two","Saurab");
        map.put("three","Ashish");
        map.put("four","Ayush");

        System.out.println(map);

        String s = map.get("two");
        System.out.println(s); // Saurab
    }
}
