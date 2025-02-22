package two.sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap {
    public int[] twoSum(int[] nums, int target) {
        // value -> index
        Map<Integer, Integer> indexesByValue = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = indexesByValue.get(target - nums[i]);
            if (null != complementIndex && complementIndex != i) {
                return new int[] {i, complementIndex};
            }
            indexesByValue.put(nums[i], i);
        }
        return new int[0];
    }
}
