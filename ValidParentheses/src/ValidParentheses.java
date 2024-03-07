import java.util.Stack;

/**
 * ValidParentheses.java
 *
 * Validates a string containing different types of parentheses
 */
class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char curChar : s.toCharArray()) {
            if (curChar == '(') {
                stack.push(')');
            } else if (curChar == '[') {
                stack.push(']');
            } else if (curChar == '{') {
                stack.push('}');
            } else if (stack.empty() || stack.pop() != curChar) {
                return false;
            }
        }

        return stack.empty();
    }
}