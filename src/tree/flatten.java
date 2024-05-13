package tree;

/**
 * Created by yangxiangdong on 2024/3/21.
 */
public class flatten {

    class Solution {
        TreeNode pre;
        public void flatten(TreeNode root) {
            if(root == null){
                return;
            }
            TreeNode left = root.left;
            TreeNode right = root.right;
            if(pre != null){
                pre.right = root;
                pre.left = null;
            }
            pre = root;
            flatten(left);
            flatten(right);
        }
    }
}
