class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row_len = matrix.length , col_len = matrix[0].length;

        int rl = 0 , rh = row_len-1;
        while(rl <= rh){
            int mid = rl + (rh-rl)/2;
            if(matrix[mid][0] <= target){
                rl = mid+1;
            }
            else{
                rh = mid-1;
            }
        }
        

        int cl = 0 , ch = col_len-1;
        while(cl <= ch){
            int mid = cl + (ch-cl)/2;
            if(matrix[0][mid] <= target) cl = mid+1;
            else ch = mid-1;
        }
     

        for(int p = 0 ; p < rl ; p++){
            int low = 0 , high = cl-1;
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