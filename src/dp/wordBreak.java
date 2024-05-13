package dp;

import java.util.HashSet;
import java.util.List;

/**
 * Created by yangxiangdong on 2024/3/24.
 */
public class wordBreak {

    class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            HashSet<String> set = new HashSet<String>(wordDict);
            boolean[] dp = new boolean[s.length() + 1];
            dp[0] = true;
            for(int i = 1; i <= s.length(); i++){
                for(int j = 0; j < i; j++){
                    if(dp[j] == true && set.contains(s.substring(j,i))){
                        dp[i] = true;
                        continue;
                    }
                }
            }
            return dp[s.length()];
        }
    }
}
