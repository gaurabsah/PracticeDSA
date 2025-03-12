package JavaBasics;

class MethodOverloading{
    double a;
    double b;
    public MethodOverloading(){

    }

    public MethodOverloading(int age){
        this.a=age;
    }

    public MethodOverloading(int age,int marks){
        this.a=age;
        this.b=marks;
    }

    public MethodOverloading(double age,double marks){
        this.a=age;
        this.b=marks;
    }
}

class MethodOverriding{
    public void say(){
        System.out.println("Hi, Good Morning!!!");
    }
}

class Ans extends MethodOverriding{
    @Override
    public void say(){
        System.out.println("Hi, Good Afternoon!!!");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        MethodOverriding obj = new Ans();
        obj.say();
    }
}
