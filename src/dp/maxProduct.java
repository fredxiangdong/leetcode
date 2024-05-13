package dp;

/**
 * Created by yangxiangdong on 2024/3/25.
 */
public class maxProduct {

    class Solution {
        public int maxProduct(int[] nums) {
            if(nums == null || nums.length == 0){
                return 0;
            }
            int max = nums[0];
            int maxPositive = nums[0];
            int maxNegative = nums[0];
            for(int i = 1; i < nums.length; i++){
                maxPositive = maxPositive * nums[i];
                maxNegative = maxNegative * nums[i];
                if(maxNegative > maxPositive){
                    int temp = maxNegative;
                    maxNegative = maxPositive;
                    maxPositive = temp;
                }
                maxNegative = Math.min(maxNegative, nums[i]);
                maxPositive = Math.max(maxPositive, nums[i]);
                max = Math.max(max, maxPositive);
            }
            return max;
        }
    }
}
