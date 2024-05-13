package tree;

/**
 * Created by yangxiangdong on 2024/3/21.
 */
public class buildTree {

    class Solution {
        int[] preorder;
        int[] inorder;
        int position;
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            this.preorder = preorder;
            this.inorder = inorder;
            return buildTree(0, preorder.length);
        }

        private TreeNode buildTree(int start, int end){
            if(start >= end){
                return null;
            }
            TreeNode root = new TreeNode(preorder[position]);
            int i;
            for(i = start; i < end && inorder[i] != preorder[position]; i++);
            position++;
            root.left = buildTree(start, i);
            root.right = buildTree(i+1, end);
            return root;
        }
    }
}
