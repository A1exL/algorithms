package valid.parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValid() {
        ValidParentheses sut = new ValidParentheses();
        assertTrue(sut.isValid("()"));
        assertTrue(sut.isValid("[]"));
        assertTrue(sut.isValid("{}"));
        assertTrue(sut.isValid("()[]{}"));
        assertTrue(sut.isValid("([])"));

        assertFalse(sut.isValid("(]"));
        assertFalse(sut.isValid("["));
    }

}