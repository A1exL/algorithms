package valid.palindrome;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {

    public boolean isPalindrome(String string) {
        List<Character> characters = new ArrayList<>();

        for (char c : string.toLowerCase().toCharArray()) {
            if(isAlphanumeric(c)) {
                characters.add(c);
            }
        }

        int size = characters.size();
        for (int i = 0; i < size; i++) {
            if (characters.get(i) != characters.get(size - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    boolean isAlphanumeric(int c) {
        return ('0' <= c &&  c <= '9' ) || ('a' <= c &&  c <= 'z');
    }
}
