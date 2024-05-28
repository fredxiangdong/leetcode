package doublePointer;

/**
 * Created by yangxiangdong on 2024/5/28.
 */
public class moveZeroes {

    public void moveZeroes(int[] nums) {
        int moveIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[moveIndex++] = nums[i];
            }
        }
        for(;moveIndex < nums.length; moveIndex++){
            nums[moveIndex++] = 0;
        }
    }
}
