package huisu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangxiangdong on 2024/3/16.
 */
public class generateParenthesis {

    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> rt = new ArrayList<>();
            dsf(rt, "", 0, 0, n);
            return rt;
        }

        private void dsf(List<String> rt, String str, int open, int close, int count){
            if(str.length() == count*2){
                rt.add(new String(str));
                return;
            }
            if(open < count){
                dsf(rt, str+"(", open+1, close, count);
            }
            if(close < open){
                dsf(rt, str+")", open, close+1, count);
            }
        }
    }

}
