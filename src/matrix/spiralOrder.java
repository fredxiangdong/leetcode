package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yangxiangdong on 2024/6/2.
 */
public class spiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0){
            return new ArrayList<Integer>();
        }
        int l = 0, r = matrix[0].length  - 1, t = 0, b = matrix.length - 1;
        Integer[] res = new Integer[(r+1) * (b+1)];
        int x = 0;
        while (true){
            for(int i = l; i <= r; i++) res[x++] = matrix[t][i];
            if(++t > b) break;
            for(int i = t; i <= b; i++) res[x++] = matrix[i][r];
            if(--r < l) break;
            for(int i = r; i >= l; i--) res[x++] = matrix[b][i];
            if(b-- < t) break;
            for(int i = b; i >= t; i--) res[x++] = matrix[i][l];
            if(++l > r) break;
        }
        return Arrays.asList(res);
    }
}