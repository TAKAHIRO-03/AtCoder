package past;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    private static Map<Character, Character> pairs = new HashMap<>() {
        {
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }
    };

    public static void main(String[] args) {
        isValid("()");
    }

    public static boolean isValid(String s) {
        var stack = new Stack<Character>();
        var letters = s.toCharArray();

        for (var l : letters) {
            if (l == '(' || l == '{' || l == '[') {
                stack.add(l);
                continue;
            }
            if (!stack.isEmpty() && stack.pop().charValue() != pairs.get(l).charValue()) {
                return false;
            }

        }

        return stack.isEmpty();
    }

}
