package binarySearch;

/**
 * Created by yangxiangdong on 2024/6/10.
 */
public class searchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = m * n - 1;
        while (low <= high){
            int mid = low + (high - low)/2;
            int x = matrix[mid/n][mid%n];
            if(x < target){
                low = mid + 1;
            }else if(x > target){
                high = mid - 1;
            }else {
                return true;
            }
        }
        return false;
    }
}
