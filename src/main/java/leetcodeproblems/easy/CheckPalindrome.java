package leetcodeproblems.easy;
// Problem:9 Palindrome Number
 public class CheckPalindrome {
    public boolean isPalindrome(int x)
    {
        int num=x;
        int rev =0;
        while(x!=0)
        {
            int digit =x%10;
            rev = rev*10+digit;
            x = x/10;
        }
        return rev==num;

    }

    public static void main(String[] args) {
        CheckPalindrome ck = new CheckPalindrome();
        System.out.println(ck.isPalindrome(122)); ;
    }
}
