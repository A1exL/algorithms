package valid.anagram;

import java.util.Arrays;

// https://leetcode.com/problems/valid-anagram/description/
public class ValidAnagram {

    public boolean isAnagram(String first, String second) {
        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();
        if (firstChars.length == secondChars.length) {
            Arrays.sort(firstChars);
            Arrays.sort(secondChars);
        }
        return Arrays.equals(firstChars, secondChars);
    }
}
