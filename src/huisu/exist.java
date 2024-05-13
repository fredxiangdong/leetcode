package huisu;

/**
 * Created by yangxiangdong on 2024/3/16.
 */
public class exist {

    class Solution {
        private int m;
        private int n;
        private char[][] board;
        private String word;
        private boolean[][] marked;
        private int[][] directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};

        public boolean exist(char[][] board, String word) {
            m = board.length;
            if(m == 0){
                return false;
            }
            n = board[0].length;
            if(n == 0){
                return false;
            }
            this.board = board;
            this.word = word;
            marked = new boolean[m][n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(dsf(i, j, 0)){
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean dsf(int i, int j, int start){
            if(start == word.length() - 1){
                return board[i][j] == word.charAt(start);
            }
            if(board[i][j] == word.charAt(start)){
                marked[i][j] = true;
                for(int[] direction : directions){
                    int newX = direction[0] + i;
                    int newY = direction[1] + j;
                    if(inArea(newX, newY) && !marked[newX][newY]){
                        if(dsf(newX, newY, start+1)){
                            return true;
                        }
                    }
                }
                marked[i][j] = false;
            }
            return false;
        }

        private boolean inArea(int i, int j){
            if(i >= 0 && i < m && j >= 0 && j < n){
                return true;
            }
            return false;
        }
    }

}
