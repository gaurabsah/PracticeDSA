package codingQuestions;

@FunctionalInterface
interface SumNumbers{
    int sum(int a, int b);
}

public class AddNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        (x, y) -> x + y
        SumNumbers sumNumbers = Integer::sum;
        int sum = sumNumbers.sum(a, b);
        System.out.println(sum);


    }
}
