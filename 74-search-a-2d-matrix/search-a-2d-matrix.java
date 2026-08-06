class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row_len = matrix.length;
        int col_len = matrix[0].length;
        int row = 0;
        // for(int i = row_len-1 ; i >= 0 ; i--){
        //     if(matrix[i][0] < target){
        //         row = i ;
        //         break;
        //     }
        // }
        int rl = 0 , rh = row_len-1;

        while(rl <= rh){
            int mid = rl + (rh-rl)/2;
            if(matrix[mid][0] <= target){
                row = mid;
                rl = mid+1;    
            }
            else{
                rh = mid-1;
            }
        }

  

       
            int low = 0 , high = col_len-1;
            while(low <= high){
                int mid = low + (high-low)/2;
                if(matrix[row][mid] == target){
                    return true;
                }
                else if(matrix[row][mid] < target){
                    low = mid + 1;
                }
                else{
                    high = mid-1;
                }
            }
        
        return false;
    }
}