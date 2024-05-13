package stack;

import java.util.Stack;

/**
 * Created by yangxiangdong on 2024/3/23.
 */
public class dailyTemperatures {

    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            int length = temperatures.length;
            int[] res = new int[length];
            Stack<Integer> stack = new Stack<>();
            for(int i = 0; i < length; i++){
                int temperature = temperatures[i];
                while(!stack.isEmpty() && temperature > temperatures[stack.peek()]){
                    int j = stack.pop();
                    res[j] = i - j;
                }
                stack.push(i);
            }
            return res;
        }
    }


}
