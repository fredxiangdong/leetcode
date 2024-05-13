package tree;

/**
 * Created by yangxiangdong on 2024/3/23.
 */
public class lowestCommonAncestor {

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null || root == p || root == q){
                return root;
            }
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if(left != null && right != null){
                return root;
            }
            return left == null ? right : left;
        }
    }

}
