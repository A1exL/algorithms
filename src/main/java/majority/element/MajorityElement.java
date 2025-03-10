package majority.element;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// https://leetcode.com/problems/majority-element/description/
public class MajorityElement {

    public int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        int requiredFreq = nums.length / 2;

        Map<Integer, Long> elementCount = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return elementCount.entrySet().stream()
                .filter(e -> e.getValue() > requiredFreq)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElseThrow();
    }
}
