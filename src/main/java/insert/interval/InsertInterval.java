package insert.interval;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/insert-interval/
public class InsertInterval {

    // Input: intervals = [[1,3],[6,9]], newInterval = [2,5], or [2, 12]
    // Output: [[1,5],[6,9]]

    //   intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
    //   Output:     [[1,2],[3,10],            [12,16]]

    // new interval can be either completely before or after our intervals
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>(intervals.length);
        int[] toAdd = newInterval;

        for (int[] interval : intervals) {
            if (toAdd[1] < interval[0]) { // adding before
                result.add(toAdd);
                toAdd = interval;
            } else if (toAdd[0] <= interval[1]) { // merging
                toAdd = new int[]{Math.min(toAdd[0], interval[0]), Math.max(toAdd[1], interval[1])};
            } else { // to add is greater
                result.add(interval);
            }
        }
        result.add(toAdd);
        return result.toArray(int[][]::new);
    }
}
