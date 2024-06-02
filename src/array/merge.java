package array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by yangxiangdong on 2024/6/1.
 */
public class merge {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> res = new ArrayList<>();
        if(intervals == null || intervals.length == 0){
            return new int[0][];
        }
        Arrays.sort(intervals, (n1, n2) -> (n1[0] - n2[0]));
        for(int i = 0; i < intervals.length; i++){
            int left = intervals[i][0];
            int right = intervals[i][1];
            while(i < intervals.length && intervals[i+1][0] <= right){
                i++;
                right = Math.max(right, intervals[i+1][1]);
            }
            res.add(new int[]{left, right});
        }
        return res.toArray(new int[0][]);
    }
}
