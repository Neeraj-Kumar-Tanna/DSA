class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low = 0 , high = mat.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            int col = rowMax(mat , mid);
            int top = mid-1 >= 0 ? mat[mid-1][col] : -1;
            int bot = mid+1  < mat.length ? mat[mid+1][col] : -1;
            if(mat[mid][col] > top && mat[mid][col] > bot){
                return new int[]{mid , col};
            }
            else if(mat[mid][col] < top){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return new int[]{-1, -1};
    }

    int rowMax(int[][] mat ,int row){
        int max = 0;
        for(int i = 0;  i < mat[0].length ; i++){
            max = mat[row][max] < mat[row][i] ? i : max;
        }
        return max;
    }
}