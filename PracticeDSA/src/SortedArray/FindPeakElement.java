package SortedArray;

public class FindPeakElement {
    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start<=end){
            mid = start + (end - start)/2;
            if (arr[mid] >= arr[0]){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
//        int[] arr = {1,2,1,3,4,6,5};
        int[] arr = {1,2,1};
        int res = peakElement(arr);
        System.out.println("Peak Element is at: "+res);
    }
}
