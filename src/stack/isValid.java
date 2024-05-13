package stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by yangxiangdong on 2024/3/23.
 */
public class isValid {

    class Solution {
        public boolean isValid(String s) {

            HashMap<Character, Character> map = new HashMap<Character, Character>(){{
                put('(',')');
                put('[',']');
                put('{','}');
            }};
            Stack<Character> stack = new Stack();
            for(Character c : s.toCharArray()){
                if(map.containsKey(c)){
                    stack.push(c);
                }else if(map.containsValue(c) && !stack.isEmpty()){
                    if(map.get(stack.peek()) != c){
                        return false;
                    }else {
                        stack.pop();
                    }
                }else {
                    return false;
                }
            }
            return stack.isEmpty();
        }
    }

}
