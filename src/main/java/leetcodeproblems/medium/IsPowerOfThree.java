package leetcodeproblems.medium;
//326
public class IsPowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0 && n > 1) {
            n /= 3;
        }

        return n == 1;
    }

    public static void main(String[] args) {

    }
}
