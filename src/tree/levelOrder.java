package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangxiangdong on 2024/3/19.
 */
public class levelOrder {

    class Solution {

        List<List<Integer>> rt = new ArrayList<>();
        public List<List<Integer>> levelOrder(TreeNode root) {
            if(root == null){
                return rt;
            }
            help(root, 0);
            return rt;
        }

        private void help(TreeNode root, int depth){
            if(rt.size() == depth){
                rt.add(new ArrayList<>());
            }
            rt.get(depth).add(root.val);
            if(root.left != null){
                help(root.left, depth+1);
            }
            if(root.right != null){
                help(root.right, depth+1);
            }
        }
    }
}
