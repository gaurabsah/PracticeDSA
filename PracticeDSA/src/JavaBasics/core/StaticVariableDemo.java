package JavaBasics.core;

public class StaticVariableDemo {
    static int x;

    public static void main(String[] args) {
        System.out.println(x); // 0
        x = 10;
        System.out.println(x); // 10
    }
}
