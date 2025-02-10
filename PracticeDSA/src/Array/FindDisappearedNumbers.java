package Array;

import java.util.*;

public class FindDisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }


        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;

    }
}
