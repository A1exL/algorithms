package binary.search;

// https://leetcode.com/problems/binary-search/description/
public class BinarySearch {

    // [-1, 1, 3, 5, 9, 12], target = 12
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int med = low + (high - low) / 2;
            if (nums[med] == target) return med;
            if (nums[med] > target) {
                 high = med - 1;
            } else {
                low = med + 1;
            }
        }
        return -1;
    }


}
