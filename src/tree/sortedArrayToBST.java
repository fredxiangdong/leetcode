package tree;

/**
 * Created by yangxiangdong on 2024/3/19.
 */
public class sortedArrayToBST {

    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return help(nums, 0, nums.length - 1);
        }

        private TreeNode help(int[] nums, int left, int right){
            if(left > right){
                return null;
            }
            int mid = left + (right - left)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = help(nums, left, mid - 1);
            root.right = help(nums, mid+1, right);
            return root;
        }
    }
}
