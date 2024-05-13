package dp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangxiangdong on 2024/3/24.
 */
public class yanghui {

    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> rt = new ArrayList<>();
            for(int i = 0; i < numRows; i++){
                List<Integer> row = new ArrayList<>();
                for(int j = 0; j <= i; j++){
                    if(j == 0 || i == j){
                        row.add(1);
                    }else {
                        row.add(rt.get(i-1).get(j-1) + rt.get(i-1).get(j));
                    }
                }
                rt.add(row);
            }
            return rt;
        }
    }
}
