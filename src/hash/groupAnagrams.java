package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by yangxiangdong on 2024/5/28.
 */
public class groupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> rt = new HashMap<String,List<String>>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String newStr = new String(chars);
            if(rt.containsKey(newStr)){
                rt.get(newStr).add(str);
            }else {
                List<String> list = new ArrayList<>();
                list.add(str);
                rt.put(newStr,list);
            }
        }
        return new ArrayList<>(rt.values());
    }
}
