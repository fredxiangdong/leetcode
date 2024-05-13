package huisu;

import java.util.*;

/**
 * Created by yangxiangdong on 2024/3/17.
 */
public class solveNQueens {

    class Solution {
        public List<List<String>> solveNQueens(int n) {
            List<List<String>> rt = new ArrayList<>();
            int[] queue = new int[n];
            Arrays.fill(queue, -1);
            Set<Integer> columns = new HashSet<>();
            Set<Integer> diagonals1 = new HashSet<>();
            Set<Integer> diagonals2 = new HashSet<>();
            backtrack(rt, queue, 0, n, columns, diagonals1, diagonals2);
            return rt;
        }

        private void backtrack(List<List<String>> rt, int[] queue, int row, int n, Set<Integer> columns, Set<Integer> diagonals1, Set<Integer> diagonals2){
            if(row == n){
                rt.add(generate(queue, n));
            }else {
                for(int i = 0; i < n; i++){
                    int diagonal1 = row - i;
                    int diagonal2 = row + i;
                    if(columns.contains(i) || diagonals1.contains(diagonal1) || diagonals2.contains(diagonal2)){
                        continue;
                    }
                    queue[row] = i;
                    columns.add(i);
                    diagonals1.add(diagonal1);
                    diagonals2.add(diagonal2);
                    backtrack(rt, queue, row+1, n, columns, diagonals1, diagonals2);
                    diagonals2.remove(diagonal2);
                    diagonals1.remove(diagonal1);
                    columns.remove(i);
                    queue[row] = -1;
                }
            }
        }

        private List<String> generate(int[] queue,int n){
            List<String> board = new ArrayList<>();
            for(int i = 0; i < n; i++){
                char[] chars = new char[n];
                Arrays.fill(chars,'.');
                chars[queue[i]] = 'Q';
                board.add(new String(chars));
            }
            return board;
        }
    }
}
