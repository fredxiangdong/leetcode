package array;

/**
 * Created by yangxiangdong on 2024/6/1.
 */
public class maxSubArray {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for(int num : nums){
            if(sum > 0){
                sum += num;
            }else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
