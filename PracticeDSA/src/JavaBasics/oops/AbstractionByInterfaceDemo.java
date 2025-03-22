package JavaBasics.oops;

interface Animal1{
//    constants are by default public static final
    int x = 9;

//    methods are by default public abstract
    void sound();
    void eat();

    static void walk(){
        System.out.println("Walking...");
    }

    default void sleep(){
        System.out.println("Sleeping...");
    }
}

class Dog1 implements Animal1{

    @Override
    public void sound() {
        System.out.println("bark");
    }

    @Override
    public void eat() {
        System.out.println("Veg/non-veg");
    }
}

class Cat implements Animal1{

    @Override
    public void sound() {
        System.out.println("meow");
    }

    @Override
    public void eat() {
        System.out.println("milk/Veg/non-veg");
    }
}

public class AbstractionByInterfaceDemo {
    public static void main(String[] args) {
        Animal1 obj = new Dog1();
        obj.sound();
        obj.sleep();
        obj.eat();
        Animal1.walk();
    }
}
