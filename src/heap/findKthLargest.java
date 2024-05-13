package heap;

import java.util.PriorityQueue;

/**
 * Created by yangxiangdong on 2024/3/24.
 */
public class findKthLargest {

    class Solution {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            for(int num : nums){
                queue.add(num);
                if(queue.size() > k){
                    queue.poll();
                }
            }
            return queue.poll();
        }
    }
}
