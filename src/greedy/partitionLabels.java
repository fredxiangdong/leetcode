package greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangxiangdong on 2024/6/6.
 */
public class partitionLabels {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        int length = s.length();
        for(int i = 0; i < length; i++){
            last[s.charAt(i) - 'a'] = i;
        }
        List<Integer> partion = new ArrayList<>();
        int start = 0, end = 0;
        for(int i = 0; i < length; i++){
            end = Math.max(end, last[s.charAt(i) - 'a']);
            if(i == end){
                partion.add(end - start +1);
                start = end + 1;
            }
        }
        return partion;
    }
}
