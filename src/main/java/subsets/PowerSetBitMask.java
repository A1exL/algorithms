package subsets;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/subsets/description/
public class PowerSetBitMask {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // i = 0,1,2,3,4,5,6,7
        for (int i = 0; i < Math.pow(2, nums.length); i++) {
            List<Integer> subset = new ArrayList<>();
            // n=0,1,2
            for (int n = 0; n < nums.length; n++) {
                int bitIndex = (int) Math.pow(2, n);
                if ((i & bitIndex) > 0) {
                    subset.add(nums[n]);
                }
            }
            result.add(subset);
        }

        return result;
    }
}
