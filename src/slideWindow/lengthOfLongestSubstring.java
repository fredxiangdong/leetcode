package slideWindow;

import java.util.HashSet;

/**
 * Created by yangxiangdong on 2024/6/1.
 */
public class lengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<Character>();
        int ans = 0, i = 0, j = 0;
        while(i < n){
            if(!set.contains(s.charAt(s.charAt(i)))){
                set.add(s.charAt(i++));
                ans = Math.max(ans, i-j);
            }else{
                set.remove(s.charAt(j++));
            }
        }
        return ans;
    }

}
