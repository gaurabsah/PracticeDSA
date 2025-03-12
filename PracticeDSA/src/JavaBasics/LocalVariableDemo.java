package JavaBasics;

public class LocalVariableDemo {

    public static void main(String[] args) {
        int x;
//        System.out.println(x); // compilation error
        x=0;
        int y = x+2;
        x=y+3;
        System.out.println(x); // 5
    }
}
