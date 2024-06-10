package graph;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangxiangdong on 2024/6/10.
 */
public class Trie {
    class TrieNode{
        private boolean isLeaf;
        private Character c;
        private Map<Character, TrieNode> children = new HashMap<>();
        public TrieNode(){}
        public TrieNode(Character c){
            this.c = c;
        }
    }

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        Map<Character, TrieNode> children = root.children;
        for(int i = 0; i < word.length(); i++){
            Character c = word.charAt(i);
            TrieNode t;
            if(children.containsKey(c)){
                t = children.get(c);
            }else{
                t = new TrieNode();
                children.put(c, t);
            }
            children = t.children;
            if(i == word.length() - 1){
                t.isLeaf = true;
            }
        }
    }
    public boolean search(String word) {
        Map<Character, TrieNode> children = root.children;
        for(int i = 0; i < word.length(); i++){
            Character c = word.charAt(i);
            if(!children.containsKey(c)){
                return false;
            }else {
                TrieNode t = children.get(c);
                if(i == word.length() - 1){
                    if(t.isLeaf){
                        return true;
                    }else {
                        return false;
                    }
                }
                children = t.children;
            }
        }
        return false;
    }

    public boolean startsWith(String prefix) {
        Map<Character, TrieNode> children = root.children;
        for(int i = 0; i < prefix.length(); i++){
            Character c = prefix.charAt(i);
            if(!children.containsKey(c)){
                return false;
            }else {
                TrieNode t = children.get(c);
                if(i == prefix.length() - 1){
                    return true;
                }
                children = t.children;
            }
        }
        return false;
    }
}
