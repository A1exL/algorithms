package valid.parentheses;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                Character openBrace = stack.pop();
                boolean isValid = (c == ')' && openBrace == '(') || (c == ']' && openBrace == '[') || (c == '}' && openBrace == '{');
                if (!isValid) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
