package tree;

/**
 * Created by yangxiangdong on 2024/3/19.
 */
public class diameterOfBinaryTree {

    class Solution {

        int ans;

        public int diameterOfBinaryTree(TreeNode root) {
            ans = 1;
            help(root);
            return ans - 1;

        }

        private int help(TreeNode root){
            if(root == null){
                return 0;
            }
            int left = help(root.left);
            int right = help(root.right);
            ans = Math.max(left+right+1, ans);
            return Math.max(left, right) + 1;
        }
    }
}
