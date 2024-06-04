package skill;

/**
 * Created by yangxiangdong on 2024/6/4.
 */
public class majorityElement {
    public int majorityElement(int[] nums) {
        int res = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++){
            if(nums[i] == res){
                count++;
            }else if(count > 1){
                count--;
            }else {
                res = nums[i];
            }
        }
        return res;
    }
}