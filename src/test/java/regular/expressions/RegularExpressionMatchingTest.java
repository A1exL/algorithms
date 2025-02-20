package regular.expressions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest {

    @Test
    void isMatch() {
        RegularExpressionMatching sut = new RegularExpressionMatching();
        assertTrue(sut.isMatch("aa", "a*"));
        assertTrue(sut.isMatch("aaa", "a*a"));
        assertTrue(sut.isMatch("aaa", "a*b*"));
        assertTrue(sut.isMatch("aaa", "a*b*.")); //!

        assertFalse(sut.isMatch("aaa", "a*b*c"));
    }

}