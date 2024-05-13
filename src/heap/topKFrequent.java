package heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * Created by yangxiangdong on 2024/3/24.
 */
public class topKFrequent {

    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int num : nums){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return map.get(o1) - map.get(o2);
                }
            });
            for(int num : map.keySet()){
                queue.add(num);
                if(queue.size() > k){
                    queue.poll();
                }
            }
            int[] res = new int[k];
            for(int i = 0; i < k; i++){
                res[i] = queue.remove();
            }
            return res;
        }
    }

}
