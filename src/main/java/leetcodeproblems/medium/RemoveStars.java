package leetcodeproblems.medium;

public class RemoveStars {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        RemoveStars obj = new RemoveStars();
        System.out.println(obj.removeStars(s));
    }

    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
