package leetcodeproblems.medium;
// The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int pointer=0;
//        int right= nums.length-1;
      for(int i=0;i< nums.length;i++)
      {
          if(nums[i]%2==0)
          {
              int temp =nums[i];
              nums[i]= nums[pointer];
              nums[pointer]=temp;
              pointer++;
          }
      }
      return nums;
    }

    public static void main(String[] args) {
     int[] nums = {0};
        SortArrayByParity obj = new SortArrayByParity();
        int ans[]=obj.sortArrayByParity(nums);
        for(int num :ans)
        {
            System.out.println(num);
        }
    }
}
