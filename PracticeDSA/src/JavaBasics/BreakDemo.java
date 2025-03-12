package JavaBasics;

public class BreakDemo {
    public static void main(String[] args) {
        String[] arr = {"abc",null,"xyz"};

        for (String ans : arr) {
            if (ans == null){
                break;
            }

            System.out.println(ans); // abc
        }
    }
}
