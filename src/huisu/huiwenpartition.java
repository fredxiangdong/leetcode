package huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yangxiangdong on 2024/3/17.
 */
public class huiwenpartition {

    class Solution {

        List<List<String>> ret = new ArrayList<>();
        List<String> cur = new ArrayList<>();
        int n;
        boolean[][] f;

        public List<List<String>> partition(String s) {
            n = s.length();
            if(n == 0){
                return ret;
            }
            f = new boolean[n][n];
            for(int i = 0; i < n; i++){
                Arrays.fill(f[i], true);
            }
            for(int i = n-1; i >= 0; i--){
                for(int j = i+1; j < n; j++){
                    f[i][j] = f[i+1][j-1] && s.charAt(i) == s.charAt(j);
                }
            }
            dsf(s, 0);
            return ret;
        }

        private void dsf(String s, int i){
            if(i == s.length()){
                ret.add(new ArrayList<>(cur));
            }
            for(int j = i; j < n; j++){
                if(f[i][j]){
                    cur.add(s.substring(i,j+1));
                    dsf(s, j+1);
                    cur.remove(cur.size()-1);
                }
            }
        }
    }

}
