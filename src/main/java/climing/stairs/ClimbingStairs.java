package climing.stairs;


import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {

    public int climbStairs(int n) {
        Map<Integer, Integer> waysToReachNthStair = new HashMap<>();
        waysToReachNthStair.put(0, 0);
        waysToReachNthStair.put(1, 1);
        waysToReachNthStair.put(2, 2);
        return cachedFibonacci(n, waysToReachNthStair);
    }

    int cachedFibonacci(int n, Map<Integer, Integer> waysToReachNthStair) {
        if (waysToReachNthStair.containsKey(n)) {
            return waysToReachNthStair.get(n);
        } else {
            int waysAmount = cachedFibonacci(n - 1, waysToReachNthStair) + cachedFibonacci(n - 2, waysToReachNthStair);
            waysToReachNthStair.put(n, waysAmount);
            return waysAmount;
        }
    }

}
