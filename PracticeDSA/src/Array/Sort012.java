package Array;

import java.util.Arrays;

public class Sort012 {

    public static void sort012(int[] arr){
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;
        int temp;
        while (mid <= end){
            if (arr[mid] == 0){
                temp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp;
                start++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;
                end--;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,0,2,1};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}
