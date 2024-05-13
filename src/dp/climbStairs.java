package dp;

/**
 * Created by yangxiangdong on 2024/3/24.
 */
public class climbStairs {

    class Solution {
        public int climbStairs(int n) {
            if(n <= 1){
                return n;
            }
            int first = 1;
            int second = 2;
            for(int i = 3; i <= n; i++){
                int third = first + second;
                first = second;
                second = third;
            }
            return second;
        }
    }
}
