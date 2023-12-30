package leetcodeproblems.medium;

public class IncreasingTripletSubSequence {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        IncreasingTripletSubSequence obj = new IncreasingTripletSubSequence();
        System.out.println(obj.increasingTriplet(nums));
    }

    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }

        return false;
    }
}
