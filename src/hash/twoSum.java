package hash;

import sun.jvm.hotspot.opto.HaltNode;

import java.util.HashMap;

/**
 * Created by yangxiangdong on 2024/5/28.
 */
public class twoSum {

    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 2){
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(target - nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            Integer j = map.get(i);
            if(j != null && j != i){
                return new int[]{i,j};
            }
        }
        return null;
    }
}
