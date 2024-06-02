package slideWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yangxiangdong on 2024/6/1.
 */
public class findAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<Integer>();
        int m = s.length();
        int n = p.length();
        if(m < n){
            return ans;
        }
        int[] scount = new int[26];
        int[] pcount = new int[26];
        for(int i = 0; i < n; i++){
            scount[s.charAt(i) - 'a']++;
            pcount[p.charAt(i) - 'a']++;
        }
        if(Arrays.equals(scount, pcount)){
            ans.add(0);
        }
        for(int i = 0; i + n < m; i++){
            scount[s.charAt(i) - 'a']--;
            scount[s.charAt(i+n) - 'a']++;
            if(Arrays.equals(scount, pcount)){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
