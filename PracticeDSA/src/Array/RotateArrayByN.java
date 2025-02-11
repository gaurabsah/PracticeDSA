package Array;

import java.util.Arrays;

public class RotateArrayByN {

    static void rotateArray(int[] arr, int k){
        // right rotate
        reverse(arr,0,arr.length - k - 1);
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        // left rotate
//        reverse(arr,0, k - 1);
//        reverse(arr, k, arr.length - 1);
//        reverse(arr, 0, arr.length - 1);
    }

    private static void reverse(int[] arr, int start, int end){
        while (start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {11,4,7,22,66,6,77};
        int rotateBy = 3;
        rotateArray(arr,rotateBy);
        System.out.println(Arrays.toString(arr));
    }
}
