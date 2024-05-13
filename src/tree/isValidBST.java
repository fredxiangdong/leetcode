package tree;

/**
 * Created by yangxiangdong on 2024/3/19.
 */
public class isValidBST {

    class Solution {
        public boolean isValidBST(TreeNode root) {
            return  isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }

        private boolean isValidBST(TreeNode root, long lower, long higher){
            if(root == null){
                return true;
            }
            if(root.val <= lower || root.val >= higher){
                return false;
            }
            return isValidBST(root.left, lower, root.val) && isValidBST(root.right, root.val, higher);
        }

    }
}
