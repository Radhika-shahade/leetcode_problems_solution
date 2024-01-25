package dsapractice2;

import java.util.Stack;

public class ValidParenthesis {

    public boolean isValidParenthesis(String s) {
        char ch[] = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char current : ch) {
            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (current == ')' && stack.peek() != '(') {
                    return false;
                }
                if (current == ']' && stack.peek() != '[') {
                    return false;
                }
                if (current == '}' && stack.peek() != '{') {
                    return false;
                }
                stack.pop();
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesis obj = new ValidParenthesis();
        String s = "]";
        System.out.println(obj.isValidParenthesis(s));
    }
}
