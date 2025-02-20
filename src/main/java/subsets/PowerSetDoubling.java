package subsets;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/subsets/description/
public class PowerSetDoubling {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>());

        for (int numberToAdd : nums) {
            int lengthBeforeDoubling = result.size();
            for (int d = 0; d < lengthBeforeDoubling; d++) {
                List<Integer> itemToDouble = result.get(d);
                List<Integer> doubled = new ArrayList<>(itemToDouble);
                doubled.add(numberToAdd);
                result.add(doubled);
            }
        }
        return result;
    }

}
