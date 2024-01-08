package leetcodeproblems.medium;
//151
public class ReverseWord {
    public String reverseWords(String s) {

        String ans="";
        for(int i=0;i<s.length();i++)
        {
            StringBuilder sb= new StringBuilder();
            while(i<s.length() && s.charAt(i)!=' ')
            {
                sb.append(s.charAt(i));
                i++;
            }
            if(sb.length()!=0)
            {
                ans =" "+ sb + ans;
            }

        }
        return ans.substring(1);

    }


    public static void main(String[] args) {
        ReverseWord rs= new ReverseWord();
        System.out.println(rs.reverseWords("the sky is blue"));

    }
}
