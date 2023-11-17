package src.main.java.leetcodeproblems.medium;
// Problem : 7 Reverse Integer
import java.util.Stack;

public class ReverseInteger {
    int reverse;
    public int reverse(int x)
    {
        Stack<Integer> stack = new Stack<>();
        while(x!=0) {
            int digit = x % 10;
            if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10) {
              return 0;
            }
            x = x / 10;
            reverse = reverse * 10 + digit;

        }
        return reverse;
    }

    public static void main(String[] args) {
        ReverseInteger rv= new ReverseInteger();
        int ans =rv.reverse(1534236469);
        System.out.println(ans);

    }
}
