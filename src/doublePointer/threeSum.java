package doublePointer;

import java.util.*;

/**
 * Created by yangxiangdong on 2024/5/28.
 */
public class threeSum{

    public List<List<Integer>> threeSum(int[] nums) {
       if(nums == null || nums.length < 2){
           return new ArrayList<List<Integer>>();
       }
       HashSet<List<Integer>> res = new HashSet<List<Integer>>();
       Arrays.sort(nums);
       for(int start = 0; start < nums.length; start++){
           int mid = start + 1;
           int end = nums.length - 1;
           while (mid < end){
               int ans = nums[start] + nums[end] + nums[mid];
               if(ans == 0){
                   List<Integer> list = new ArrayList<>();
                   list.add(nums[start]);
                   list.add(nums[mid]);
                   list.add(nums[end]);
                   res.add(list);
                   while (mid++ < end && nums[mid] == nums[mid-1]);
                   while (end-- > mid && nums[end] == nums[mid+1]);
               }else if(ans < 0){
                   mid++;
               }else {
                   end--;
               }
           }
       }
       return new ArrayList<List<Integer>>(res);
    }
}
