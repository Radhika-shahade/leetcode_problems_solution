package dsapractice2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//        Output: [1,2,2,3,5,6]
public class MergeSortedArray {


    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int p1= m-1;
        int p2=n-1;
        int i=m+n-1;
        while(p2>=0)
        {
          if(nums2[p2]<nums1[p1]&&p1>=0)
          {
              nums1[i]=nums1[p1];
              p1--;
          }
          else {
              nums1[i]=nums2[p2];
              p2--;
          }
          i--;
        }
        for(int p :nums1)
        {
            System.out.println(p);
        }
        int a=10;
        Integer t= a;
        Integer y= Integer.valueOf(a);

        int num=90;
        Long b= (long) num;
        int num2= Math.toIntExact(b);
        int num3= b.intValue();
        System.out.println(num2);


    }

    public static void main(String[] args) {
        MergeSortedArray obj= new MergeSortedArray();
        int nums1[] = {1};
        int m = 1;
        int [] nums2 = {};
        int n = 0;
        obj.merge(nums1,m,nums2,n);
    }
}
