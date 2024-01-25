package dsapractice2;
//Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]

public class TwoSum {
    public int[] twoSum(int arr[], int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;i++)
            {
                if(arr[i]+arr[j]==target)
                {
                    int a[]={i,j};
                    return a;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int nums[]={3,2,4};
        TwoSum obj= new TwoSum();
       int ans[]= obj.twoSum(nums,6);
       for(int ns :ans)
       {
           System.out.println(ns);
       }
    }

}
