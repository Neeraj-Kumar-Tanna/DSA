class Solution {
    public int uniquePathsIII(int[][] grid) {
        int cnt = 0;

        for(int i = 0; i < grid.length ; i++){   
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == 1){
                    System.out.println("hi");
                    cnt = rec(i , j , grid.length , grid[0].length , grid);
                }
            }
        }

        return cnt;
    }

    private static int rec(int i , int j ,int n , int m , int[][] grid){
        if(grid[i][j] == 2){
            if(check(grid)){ //write check code here
                return  1;
            }
            return 0;
        }

        int u = 0 , r = 0 , d = 0 , l = 0;

        if(i > 0 && (grid[i-1][j] == 0 || grid[i-1][j] == 2)){
            if(grid[i-1][j] == 0)  grid[i-1][j] = 3;
            u = rec(i-1 , j , n , m , grid);
            if(grid[i-1][j] == 3)  grid[i-1][j] = 0;
            
        }

        if(j < m-1 && (grid[i][j+1] == 0 || grid[i][j+1] == 2)){
            if(grid[i][j+1] == 0) grid[i][j+1] = 3;
            r = rec(i , j+1 , n , m , grid);
            if(grid[i][j+1] == 3) grid[i][j+1] = 0;
        }

        if(i < n-1 && (grid[i+1][j] == 0 || grid[i+1][j] == 2)){
            if(grid[i+1][j] == 0) grid[i+1][j] = 3;
            d = rec(i+1 , j , n , m , grid);
            if(grid[i+1][j] == 3) grid[i+1][j] = 0;
        }

        if(j > 0 && (grid[i][j-1] == 0 || grid[i][j-1] == 2)){
            if(grid[i][j-1] == 0) grid[i][j-1] = 3;
            l = rec(i , j-1 , n , m , grid);
            if(grid[i][j-1] == 3) grid[i][j-1] = 0;
        }

        return u+r+d+l;
    }


    private static boolean check(int[][] grid){
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == 0) return false;
            }
        }

        return true;
    }
}