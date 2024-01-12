package leetcodeproblems.medium;

public class RemoveOuterMostParentheses {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) {
                    result.append(c);
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();

    }

    public static void main(String[] args) {
        RemoveOuterMostParentheses obj= new RemoveOuterMostParentheses();
       String s = "(()())(())";
        System.out.println(obj.removeOuterParentheses(s));
    }
}
