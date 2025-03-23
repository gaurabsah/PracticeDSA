package JavaBasics.collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/*
FOCUS: insertion order, duplicate value, null value, when to use
 */

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
//        Map<String,String> map = new TreeMap<>();
//        Map<String,String> map = new LinkedHashMap<>();
//        Map<String,String> map = new ConcurrentHashMap<>();
        map.put("one","Gaurab");
        map.put("two","Saurab");
        map.put("three","Ashish");
        map.put("four","Ayush");
        map.put("one","Riya");
        map.put("five","Gaurab");

        System.out.println(map);

        String s = map.get("two");
        System.out.println(s); // Saurab

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println("Key: "+next.getKey()+" Value: "+next.getValue());
        }

    }
}
