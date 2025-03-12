package JavaBasics;

public class StringDemo {
    public static void main(String[] args) {
        String name1 = "Gaurab";
        String name2 = "Gaurab";
        String name3 = new String("Gaurab");

        System.out.println(name1 == name2); // true
        System.out.println(name1 == name3); // false
        System.out.println(name1.equals(name3)); // true
        System.out.println(name2.equals(name3)); // true

        name1 = "Saurav";
        System.out.println(name1); // Saurav

    }
}
