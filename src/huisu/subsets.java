package huisu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangxiangdong on 2024/3/16.
 */
public class subsets {

    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> ret = new ArrayList<>();
            List<Integer> cur = new ArrayList<>();
            dsf(ret, cur, 0, nums);
            return ret;
        }

        private void dsf(List<List<Integer>> ret, List<Integer> cur, int index, int[] nums){
            ret.add(new ArrayList<>(cur));
            for(int i = index; i < nums.length; i++){
                cur.add(nums[i]);
                dsf(ret, cur, i+1, nums);
                cur.remove(cur.size()-1);
            }
        }
    }

}
