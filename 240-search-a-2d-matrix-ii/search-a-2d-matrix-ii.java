class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row_len = matrix.length , col_len = matrix[0].length;

        int i = 0 ;
        while(i < row_len && matrix[i][0] <= target){
            i++;
        }

        int j = 0;
        while(j < col_len && matrix[0][j] <= target){
            j++;
        }
     

        for(int p = 0 ; p < i ; p++){
            int low = 0 , high = j-1;
            while(low <= high){
                int mid = low + (high - low)/2;
                if(matrix[p][mid] == target){
                    return true;
                }
                else if(matrix[p][mid] < target){
                    low = mid + 1;
                }
                else{
                    high = mid -1;
                }
            }
        }

        return false;
    }
}