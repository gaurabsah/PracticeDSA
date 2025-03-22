package DP;

import java.util.Arrays;

public class KadanesAlgorithm {

    static int maxSubArraySum(int[] nums){
        int result = Integer.MIN_VALUE;
        int maxEnding = 0;

        for (int i = 0; i < nums.length; i++){
            maxEnding = Math.max(maxEnding + nums[i], nums[i]);
            result = Math.max(result, maxEnding);
        }
        return result;
    }

}
