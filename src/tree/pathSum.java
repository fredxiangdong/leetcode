package tree;

/**
 * Created by yangxiangdong on 2024/3/21.
 */
public class pathSum {

    class Solution {
        public int pathSum(TreeNode root, int targetSum) {
            if(root == null){
                return 0;
            }
            return rootSum(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
        }

        public int rootSum(TreeNode root, int targetSum){
            if(root == null){
                return 0;
            }
            int count = 0;
            if(root.val == targetSum){
                count++;
            }
            count += rootSum(root.left, targetSum - root.val);
            count += rootSum(root.right, targetSum - root.val);
            return count;
        }
    }
}
