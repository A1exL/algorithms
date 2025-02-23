package valid.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void isPalindrome() {
        ValidPalindrome sut = new ValidPalindrome();
        assertTrue(sut.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(sut.isPalindrome("race a car"));
        assertTrue(sut.isPalindrome("   "));
    }
}