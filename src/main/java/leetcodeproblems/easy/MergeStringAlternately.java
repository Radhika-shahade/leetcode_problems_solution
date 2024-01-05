package leetcodeproblems.easy;
//1768
public class MergeStringAlternately {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        MergeStringAlternately obj = new MergeStringAlternately();
        System.out.println(obj.mergeAlternately(word1,word2));
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }

}
