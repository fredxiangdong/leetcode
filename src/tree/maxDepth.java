package tree;

/**
 * Created by yangxiangdong on 2024/3/18.
 */
public class maxDepth {

    class Solution {
        public int maxDepth(TreeNode root) {
            if(root == null){
                return 0;
            }
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right) + 1;
        }
    }

}
