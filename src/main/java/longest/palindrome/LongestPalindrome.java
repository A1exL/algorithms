package longest.palindrome;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// https://leetcode.com/problems/longest-palindrome/
public class LongestPalindrome {

    public int longestPalindrome(String s) {
        if (s.length() == 1) return 1;

        int charPairsCount = 0;

        Map<Integer, Long> charsCount = s.chars().boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Long charCount : charsCount.values()) {
            charPairsCount += (int) (charCount / 2);
        }

        int pairedCharsAmount = charPairsCount * 2;
        boolean canAddOneChar = s.length() > pairedCharsAmount;

        return pairedCharsAmount + (canAddOneChar ? 1 : 0);
    }
}
