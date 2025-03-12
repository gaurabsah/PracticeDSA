package JavaBasics;

public class ContinueDemo {
    public static void main(String[] args) {
        String[] arr = {"abc",null,"xyz"};

        for (String ans : arr) {
            if (ans == null){
                continue;
            }

            System.out.println(ans); // abc, xyz
        }
    }
}
