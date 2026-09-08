class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] arr = new char[n][n];
        for(int i = 0 ;i < n ; i++){
            Arrays.fill(arr[i] , '.');
        }

        List<List<String>> res = new ArrayList<>();
        rec(0 , n , arr , res);

        return res;
    }

    private static void rec(int row , int n , char[][] arr , List<List<String>> res){
        if(row == n){
            List<String> temp = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                temp.add(new String(arr[i]));
            }

            res.add(temp);
            return;
        }

        for(int i = 0 ; i < n ; i++){
            if(check(row , i ,arr)){
                arr[row][i] = 'Q';
                rec(row+1 , n , arr , res);
                arr[row][i] = '.';
            }
        }
    }

    private static boolean check(int row , int col ,char[][] arr){
        int n = arr.length;

        if(arr[row][col] == 'Q') return false;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[row][i] == 'Q') return false;

            if(arr[i][col] == 'Q') return false;
        }

        int r = row;
        int c= col;
        while(r < n && c < n){
            if(arr[r][c]=='Q'){
                return false;
            }
            r++;
            c++;
        }

        r = row;
        c = col;
        while(r < n && c>=0){
            if(arr[r][c]=='Q'){
                return false;
            }
            r++;
            c--;
        }

        r = row;
        c = col;
        while(r >= 0 && c>=0){
            if(arr[r][c]=='Q'){
                return false;
            }
            r--;
            c--;
        }

        r = row;
        c = col;
        while(r >= 0 && c<n){
            if(arr[r][c]=='Q'){
                return false;
            }
            r--;
            c++;
        }

        return true;
    }
}