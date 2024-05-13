package huisu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangxiangdong on 2024/3/16.
 */
public class permute {

    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ret = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            int n = nums.length;
            boolean[] used = new boolean[n];
            permute(nums, ret, path, 0, n, used);
            return ret;
        }

        private void permute(int[] nums, List<List<Integer>> ret, List<Integer> path, int depth, int length, boolean[] used){
            if(depth == length){
                ret.add(new ArrayList<>(path));
                return;
            }
            for(int i = 0; i < length; i++){
                if(!used[i]){
                    path.add(nums[i]);
                    used[i] = true;
                    permute(nums, ret, path, depth+1, length, used);
                    used[i] = false;
                    path.remove(path.size()-1);
                }
            }
        }

    }
}
