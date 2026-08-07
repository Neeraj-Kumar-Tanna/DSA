class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row_len = matrix.length , col_len = matrix[0].length;
        int i = 0 , j = col_len-1;
        while(i < row_len && j >= 0){
            int curr= matrix[i][j];
            if(curr == target) return true;
            else if(curr > target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}