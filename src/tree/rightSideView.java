package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangxiangdong on 2024/3/21.
 */
public class rightSideView {

    class Solution {

        List<Integer> ans;
        public List<Integer> rightSideView(TreeNode root) {
            ans = new ArrayList<>();
            dsf(root, 0);
            return ans;
        }

        private void dsf(TreeNode root, int depth){
            if(root == null){
                return;
            }
            if(ans.size() <= depth){
                ans.add(root.val);
            }else {
                ans.set(depth, root.val);
            }
            dsf(root.left, depth+1);
            dsf(root.right, depth+1);
        }
    }
}
