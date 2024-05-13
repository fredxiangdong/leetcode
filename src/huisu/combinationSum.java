package huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yangxiangdong on 2024/3/16.
 */
public class combinationSum {

    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> rt = new ArrayList<>();
            List<Integer> cur = new ArrayList<>();
            Arrays.sort(candidates);
            dsf(candidates, rt, cur, 0, target);
            return rt;
        }

        private void dsf(int[] candidates, List<List<Integer>> rt, List<Integer> cur, int index, int target){
            if(target == 0){
                rt.add(new ArrayList<>(cur));
                return;
            }
            for(int i = index; i < candidates.length; i++){
                if(candidates[i] > target){
                    return;
                }
                cur.add(candidates[i]);
                dsf(candidates, rt, cur, i, target - candidates[i]);
                cur.remove(cur.size() - 1);
            }
        }
    }
}
