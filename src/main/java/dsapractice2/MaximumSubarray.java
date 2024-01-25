package dsapractice2;

public class MaximumSubarray {
    public int maximumSubArray(int arr[])
    {
        int currentSum = arr[0];
        int sum=arr[0];
        for(int i=1;i< arr.length;i++)
        {
            currentSum=Math.max(arr[i],arr[i]+currentSum);
            sum=Math.max(currentSum,sum);

        }
        return sum;
    }

    public static void main(String[] args) {
        MaximumSubarray obj= new MaximumSubarray();
        int nums[] = {5,4,-1,7,8};
        System.out.println(obj.maximumSubArray(nums));
    }
}
