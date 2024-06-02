package substring;

/**
 * Created by yangxiangdong on 2024/6/1.
 */
public class subarraySum {

    int count = 0;

    public int subarraySum(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j< nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}
