package skill;

/**
 * Created by yangxiangdong on 2024/6/4.
 */
public class findDuplicate {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1, ans = -1;
        while (l <= r){
            int mid = (l+r)/2;
            int cnt = 0;
            for(int i = 0; i < n; i++){
                if(nums[i] <= mid){
                    cnt++;
                }
            }
            if(cnt <= mid){
                l = mid + 1;
            }else {
                r = mid - 1;
                ans = mid;
            }
        }
        return ans;
    }
}