package Array;

import java.util.Arrays;

public class MoveNegativeNumber {

    static void moveNegativeElements(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int temp;

        while (start <= end){
            if (arr[start] < 0 && arr[end] >= 0){
                start++;
                end--;
            } else if (arr[start] >= 0 && arr[end] < 0) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            } else if (arr[start] >= 0 && arr[end] >= 0) {
                end--;
            } else if (arr[start] < 0 && arr[end] < 0) {
                start++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,-1,6,-2,-7,0};
        moveNegativeElements(arr);
        System.out.println(Arrays.toString(arr));
    }
}
