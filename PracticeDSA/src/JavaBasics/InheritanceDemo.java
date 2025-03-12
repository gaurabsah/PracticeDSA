package JavaBasics;

class Animal{

    public void bark(){
        System.out.println("Barking");
    }

    public void eat(){
        System.out.println("eat");
    }

}

class Dog extends Animal{
    public void eat(){
        System.out.println("eat meat");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.bark();
        obj.eat();
    }
}
