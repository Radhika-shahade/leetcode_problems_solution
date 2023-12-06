package leetcodeproblems.medium;
//34
public class FindFirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
     int low=0;
     int mid=0;
     int high= nums.length-1;
     int res[]={-1,-1};
     while(low<=high){
         mid=(low+high)/2;
         if(target==nums[mid]){
               res[0] = mid;
               high=mid-1;
         } else if (nums[mid]<target) {
             low=mid+1;
         }
         else {
             high=mid-1;
         }
     }
         low=0;
         mid=0;
         high= nums.length-1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (target == nums[mid]) {
                res[1] = mid;
                low = mid + 1; // Corrected this line to update low instead of high
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
   return res;
    }

    public static void main(String[] args) {
        FindFirstAndLastPosition obj= new FindFirstAndLastPosition();
        int []nums = {5,7,7,8,10};
        int target = 8;
       int a[] = obj.searchRange(nums,target);
       for(int i=0;i<a.length;i++){
           System.out.println(a[i]);
       }
    }

}
