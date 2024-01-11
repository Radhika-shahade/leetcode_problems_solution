package leetcodeproblems.medium;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // The peak element is likely on the left side, including mid
                right = mid;
            } else {
                // The peak element is likely on the right side, excluding mid
                left = mid + 1;
            }
        }

        // At the end of the loop, 'left' and 'right' will be pointing to the peak element
        return left;
    }
}