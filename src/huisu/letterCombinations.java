package huisu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yangxiangdong on 2024/3/16.
 */
public class letterCombinations {


    class Solution {

        Map<String, String> phone = new HashMap<String, String>(){{
            put("2", "abc");
            put("3", "def");
            put("4", "ghi");
            put("5", "jkl");
            put("6", "mno");
            put("7", "pqrs");
            put("8", "tuv");
            put("9", "wxyz");
        }};

        List<String> ans = new ArrayList<>();

        public List<String> letterCombinations(String digits) {
            if(digits == null || digits.length() == 0){
                return ans;
            }
            dsf("", digits);
            return ans;
        }

        private void dsf(String pre, String nextDigit){
            if(nextDigit.length() == 0){
                ans.add(pre);
                return;
            }
            String letters = phone.get(nextDigit.substring(0,1));
            for(int i = 0; i < letters.length(); i++){
                dsf(pre + letters.charAt(i), nextDigit.substring(1));
            }
        }

    }
}
