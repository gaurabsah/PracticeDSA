package SortedArray;

public class BinarySearch {

    public static int search(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        int mid;

        while (start <= end){
            mid = start + (end - start)/2;

            if (arr[mid] == key){
                return mid;
            }

            if (key > arr[mid]){
                start = mid + 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,8,11,22,23};
        int searchKey = 22;
        int search = search(arr, searchKey);
        System.out.println(search);
    }
}
