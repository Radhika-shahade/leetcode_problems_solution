package leetcodeproblems.medium;
//392
public class Subsequence {
    public boolean isSubsequence(String s, String t) {
        int p1 = 0;
        int p2 = 0;
        while (s.length() > p1 && t.length() > p2) {
            if (s.charAt(p1) == t.charAt(p2)) {
                p1++;
                p2++;
            } else {
                p2++;
            }
        }
        return p1 == s.length();
    }

    public static void main(String[] args) {
        {
            String s = "abc";
            String t = "ahbgdc";
            Subsequence obj = new Subsequence();
            System.out.println(obj.isSubsequence(s, t));
        }
    }
}




