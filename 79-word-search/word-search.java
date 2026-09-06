class Solution {
    public boolean exist(char[][] board, String word) {

        int[][] ch = new int[board.length][board[0].length];

        for(int i= 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(word.charAt(0) == board[i][j]){
                    ch[i][j] = 1;
                    if(rec(i , j , 1 ,ch, board , word)) return true;
                    ch[i][j] = 0;
                }
            }
        }
        
        return false;
    }

    private static boolean rec(int bi ,int bj , int ind ,int[][] ch , char[][] board,  String word){
        // System.out.println("bi:"+bi +" bj:"+bj+" ind:"+ind);
        if(ind == word.length()) return true;

        if(bi > 0 && ch[bi-1][bj] == 0 &&board[bi-1][bj]==word.charAt(ind)){
            ch[bi-1][bj] = 1;
            if(rec(bi-1 , bj ,ind+1 , ch , board , word)) return true;
            ch[bi-1][bj] = 0;
        }

        if(bi < board.length-1 && ch[bi+1][bj] == 0 &&board[bi+1][bj]==word.charAt(ind)){
            ch[bi+1][bj] = 1;
            if(rec(bi+1 , bj ,ind+1 , ch , board , word)) return true;
            ch[bi+1][bj] = 0;
        }

        if(bj > 0 && ch[bi][bj-1] == 0 &&board[bi][bj-1]==word.charAt(ind)){
            ch[bi][bj-1] = 1;
            if(rec(bi , bj-1 ,ind+1 , ch , board , word)) return true;
            ch[bi][bj-1] = 0;
        }

        if(bj < board[0].length-1 && ch[bi][bj+1] == 0 &&board[bi][bj+1]==word.charAt(ind)){
            ch[bi][bj+1] = 1;
            if(rec(bi , bj+1 ,ind+1 , ch , board , word)) return true;
            ch[bi][bj+1] = 0;
        }

        return false;
    }
}