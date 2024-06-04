package skill;

/**
 * Created by yangxiangdong on 2024/6/4.
 */
public class sortColors {
    public void sortColors(int[] nums) {
        int p0 = 0, p1 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                int temp = nums[i];
                nums[i] = nums[p1];
                nums[p1] = temp;
                p1++;
            }else if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[p0];
                nums[p0] = temp;
                if(p0 < p1){
                    temp = nums[p1];
                    nums[p1] = nums[i];
                    nums[i] = temp;
                }
                p0++;
                p1++;
            }
        }
    }
}