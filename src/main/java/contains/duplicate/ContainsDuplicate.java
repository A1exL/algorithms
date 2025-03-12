package contains.duplicate;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate/description/
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int number : nums) {
            if (!uniqueNumbers.add(number)) {
                return true;
            }
        }
        return false;
    }
}
