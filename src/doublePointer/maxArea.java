package doublePointer;

/**
 * Created by yangxiangdong on 2024/5/28.
 */
public class maxArea {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r){
            ans = Math.max(Math.min(height[l],height[r])*(r-l), ans);
            if(height[l] < height[r]){
                l++;
            }else {
                r--;
            }
        }
        return ans;
    }
}
