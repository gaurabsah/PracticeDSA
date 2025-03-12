package JavaBasics;

public class InstanceVariableDemo {

    int x;

    public static void main(String[] args) {
//        x=0; // compilation error
        InstanceVariableDemo obj = new InstanceVariableDemo();
        System.out.println(obj.x);          // 0
        obj.x=10;
        System.out.println(obj.x);          //10
        System.out.println(obj.x = 20);     //20

    }
}
