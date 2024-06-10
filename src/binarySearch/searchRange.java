package binarySearch;

/**
 * Created by yangxiangdong on 2024/6/10.
 */
public class searchRange {
    public int[] searchRange(int[] nums, int target) {
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false) - 1;
        if (left <= right && nums[left] == target && nums[right] == target) {
            return new int[]{left, right};
        }
        return new int[]{-1, -1};
    }

    private int binarySearch(int[] nums, int target, boolean lower){
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] > target || (lower && nums[mid] >= target)){
                right = mid - 1;
                ans = mid;
            }else {
                left = mid + 1;
            }
        }
        return ans;
    }

}