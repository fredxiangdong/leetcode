package multiDp;

/**
 * Created by yangxiangdong on 2024/6/5.
 */
public class longestPalindrome {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return "";
        }
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++){
            int length1 = length(s, i, i);
            int length2 = length(s, i, i+1);
            int length = Math.max(length1, length2);
            if(length > end - start){
                start = i - (length - 1)/2;
                end = i + length/2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int length(String s, int left, int right){
        int l = left;
        int r = right;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r - l - 1;
    }
}