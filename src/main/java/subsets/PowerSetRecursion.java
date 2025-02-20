package subsets;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/subsets/description/
public class PowerSetRecursion {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        startLoop(nums, new LinkedList<>(), 0, result);
        return result;
    }

    private void startLoop(int[] nums, Deque<Integer> path, int depth, List<List<Integer>> result) {
        if (depth == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        path.addLast(nums[depth]);
        startLoop(nums, path, depth + 1, result);
        path.removeLast();
        startLoop(nums, path, depth + 1, result);
    }
}
