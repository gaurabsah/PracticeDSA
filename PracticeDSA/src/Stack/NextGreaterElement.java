package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()){
                while (!stack.isEmpty() && stack.peek() <= arr[i]){
                    stack.pop();
                }
            }

            if (stack.isEmpty()){
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }

            stack.push(arr[i]);

        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3,10,4,2,1,2,6,1,7,2,9};
        int[] nextGreaterElement = nextGreaterElement(arr);
        System.out.println(Arrays.toString(nextGreaterElement));
    }
}
