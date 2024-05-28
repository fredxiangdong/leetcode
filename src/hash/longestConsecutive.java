package hash;

import java.util.HashSet;

/**
 * Created by yangxiangdong on 2024/5/28.
 */
public class longestConsecutive {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            set.add(num);
        }
        int longest = 0;
        for(int num : nums){
            if(!set.contains(num-1)){
                int curNum = num;
                int length = 1;
                while (set.contains(curNum+1)){
                    curNum++;
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }

}
