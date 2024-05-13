package tree;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * Created by yangxiangdong on 2024/3/19.
 */
public class kthSmallest {

    class Solution {
        public int kthSmallest(TreeNode root, int k) {
            Deque<TreeNode> deque = new ArrayDeque<TreeNode>();
            while (root != null || !deque.isEmpty()){
                while (root != null){
                    deque.push(root);
                    root = root.left;
                }
                root = deque.pop();
                k--;
                if(k == 0){
                    break;
                }
                root = root.right;
            }
            return root.val;
        }
    }

}
