package stack;

import java.util.LinkedList;

/**
 * Created by yangxiangdong on 2024/3/23.
 */
public class decodeString {

    class Solution {
        public String decodeString(String s) {
            LinkedList<String> strStack = new LinkedList<>();
            LinkedList<Integer> multiStack = new LinkedList<>();
            StringBuilder str = new StringBuilder();
            int multi = 0;
            for(Character c : s.toCharArray()){
                if(c.equals('[')){
                    strStack.add(str.toString());
                    multiStack.add(multi);
                    str = new StringBuilder();
                    multi = 0;
                }else if(c.equals(']')){
                    StringBuilder temp = new StringBuilder();
                    int num = multiStack.removeLast();
                    for (int i = 0; i < num; i++){
                        temp.append(str.toString());
                    }
                    str = new StringBuilder(strStack.removeLast()).append(temp);
                }else if(c >= '0' && c <= '9'){
                    multi = multi * 10 + Integer.valueOf(String.valueOf(c));
                }else {
                    str.append(c);
                }
            }
            return str.toString();
        }
    }

}
