package dp;

/**
 * Created by yangxiangdong on 2024/3/24.
 */
public class rob {

    class Solution {
        public int rob(int[] nums) {
            if(nums == null || nums.length == 0){
                return 0;
            }
            int[] dp = new int[nums.length+1];
            dp[0] = 0;
            dp[1] = nums[0];
            for(int i = 2; i <= nums.length; i++){
                dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i-1]);
            }
            return dp[nums.length];
        }
    }
}
