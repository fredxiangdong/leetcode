package dp;

import java.util.Arrays;

/**
 * Created by yangxiangdong on 2024/3/24.
 */
public class lengthOfLIS {

    class Solution {
        public int lengthOfLIS(int[] nums) {
            if(nums == null || nums.length == 0){
                return 0;
            }
            int[] dp = new int[nums.length];
            Arrays.fill(dp, 1);
            int res = 0;
            for(int i = 0; i < nums.length; i++){
                for(int j = 0; j < i; j++){
                    if(nums[i] > nums[j]){
                        dp[i] = Math.max(dp[i], dp[j]+1);
                    }
                }
                res = Math.max(res, dp[i]);
            }
            return res;
        }
    }
}
