package leetcodeproblems.medium;

import java.util.Stack;

public class RemoveDuplicates {
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); // Remove the duplicate
            } else {
                stack.push(c); // Add non-duplicate character to the stack
            }
        }

        // Build the final string from the stack
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abbaca";
        String result = removeDuplicates(input);
        System.out.println("Final String after duplicate removals: " + result);
    }
}
