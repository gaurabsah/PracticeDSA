package JavaBasics;

class MethodOverloading{
//    double a;
//    double b;
    public int methodOverloading(int a, int b){
        return a+b;
    }

    public int methodOverloading(int a, int b, int x){
        return a+b+x;
    }

    public double methodOverloading(double age,double marks){
        return marks - age;
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
