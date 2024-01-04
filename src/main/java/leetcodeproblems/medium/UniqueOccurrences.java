package leetcodeproblems.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//1207
public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map= new HashMap();
        for(int num :arr)
        {
            map.put (num, map.getOrDefault(num,0)+1);
        }
        Set<Integer> set= new HashSet();
        for(int count :map.values())
        {
            if(!set.contains(count))
            {
                set.add(count);
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        UniqueOccurrences obj = new UniqueOccurrences();
        int [] arr = {1,2,2,1,1,3};
        System.out.println(obj.uniqueOccurrences(arr));
    }
}

