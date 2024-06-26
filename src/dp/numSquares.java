package dp;

/**
 * Created by yangxiangdong on 2024/3/24.
 */
public class numSquares {

    class Solution {
        public int numSquares(int n) {
            int[] dp = new int[n+1];
            for(int i = 1; i <= n; i++){
                dp[i] = i;
                for(int j = 1; i - j*j >= 0; j++){
                    dp[i] = Math.min(dp[i], dp[i-j*j]+1);
                }
            }
            return dp[n];
        }
    }

}
