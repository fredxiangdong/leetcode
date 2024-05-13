package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangxiangdong on 2024/3/18.
 */
public class inorderTraversal {


    class Solution {

        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            inOrder(ans, root);
            return ans;
        }

        private void inOrder(List<Integer> ans, TreeNode root){
            if(root == null){
                return;
            }
            inOrder(ans, root.left);
            ans.add(root.val);
            inOrder(ans, root.right);
        }

    }
}
