package JavaBasics;

public class ExceptionDemo {

    public static int calculate(int x, int y){
        return x/y;
    }

    public static void main(String[] args) {
        int x=10, y=0;
        try{
            calculate(x, y);
        }
        catch (ArithmeticException e){
            System.out.println("Exception Caught: "+e.getMessage());
        }
        catch (Exception e){
            System.out.println("Exception Caught: "+e.getMessage());
        }
//        throw compile time error because exception is caught already
//        catch (ArithmeticException e){
//            System.out.println("Exception Caught: "+e.getMessage());
//        }
        finally {
            System.out.println("Finally");
        }
    }
}
