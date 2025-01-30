package Array;

/**
 *  Maximum Sub Array Sum
 */

public class KadanesAlgorithm {

    public static int maxSubArraySum(int[] arr){
        int result = 0;
        int maxEnding = 0;

        for (int i = 0; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i],arr[i]);
            result = Math.max(result,maxEnding);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int subArraySum = maxSubArraySum(arr);
        System.out.println(subArraySum);
    }
}
