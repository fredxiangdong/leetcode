package tree;

import java.util.Map;

/**
 * Created by yangxiangdong on 2024/3/23.
 */
public class maxPathSum {

    class Solution {
        int maxSum = Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root) {
            maxGain(root);
            return maxSum;
        }

        private int maxGain(TreeNode root){
            if(root == null){
                return 0;
            }
            int left = Math.max(maxGain(root.left), 0);
            int right = Math.max(maxGain(root.right), 0);
            maxSum = Math.max(maxSum, left + right + root.val);
            return Math.max(left, right) + root.val;
        }
    }

}
