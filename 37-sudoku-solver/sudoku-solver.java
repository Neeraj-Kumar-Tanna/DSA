class Solution {
    public void solveSudoku(char[][] board) {
      // mainSol(0 , 0 , board);
      rec(board);
      PrintSol(board);
    }


    private boolean rec(char[][] board){
      for(int i = 0 ; i < board.length ; i++){
        for(int j = 0 ; j < board[0].length ; j++){

          if(board[i][j] == '.'){
            for(char ch = '1' ; ch <= '9' ; ch++){
              if(valid(board , i , j , ch)){
                board[i][j] = ch;
                boolean res = rec(board);
                if(res){  
                  return true;
                }
                else{
                  board[i][j] = '.';
                }
              }
            }

            return false;
          }
        }
      }

      return true;
    }

    private boolean valid(char[][] board , int  i , int j , char ch){
      for(int k = 0 ; k < board.length ; k++){
        if(board[i][k] == ch) return false;
        if(board[k][j] == ch) return false;
        if(board[(i/3)*3 + (k/3)][(j/3)*3+(k%3)] == ch) return false;
      }

      return true;
    }

    // private boolean mainSol(int col , int row ,char[][] board){
    //   if(row > 8){
    //     PrintSol(board);
    //     return true;
    //   }

    //   while(row < 9 && board[row][col] != '.'){
    //     if(col < 8) col++;
    //     else {
    //       col = 0;
    //       row++;
    //     }
    //   }

    //   if(row > 8){
    //     PrintSol(board);
    //     return true;
    //   }

    //   // if(board[row][col] != '.'){
    //   //   if(col+1 < 9){
    //   //     res = mainSol(col+1, row , board);
          
    //   //   }
    //   //   else{
    //   //     res = mainSol(0 , row+1 , board);
    //   //   }
    //   //   return res;
    //   // }


    //   // adding all possible values
    //   List<Character> possible_val = new ArrayList<>();
    //   for(int i = 1 ; i < 10 ; i++){
    //     char temp = (char)(48+i);
    //     possible_val.add(temp);
    //   }

    //   //remove existing values
    //   for(int i = 0 ; i < 9 ; i++){
    //     // System.out.println(row + " ; " + i);
    //     // possible_val.remove(board[row][i]);
    //     // possible_val.remove(board[i][col]);

    //     possible_val.remove(Character.valueOf(board[row][i]));
    //     possible_val.remove(Character.valueOf(board[i][col]));
    //   }
    //   for(int i = (row/3)*3 ; i < ((row/3)*3)+3 ; i++){
    //     for(int j = (col/3)*3 ; j < ((col/3)*3)+3 ; j++){
    //       possible_val.remove(Character.valueOf(board[i][j]));
    //     }
    //   }

    //   boolean res = false;

    //   for(int i = 0 ; i < possible_val.size() && !res; i++){
    //     if(col < 9){
    //       board[row][col] = possible_val.get(i);
    //       res = mainSol(col+1, row , board);
    //       board[row][col] = '.';
    //     }
    //     else{
    //       res = mainSol(0 , row+1 , board);
    //     }
    //   }

    //   // if(col == 8 && row == 8 && res == true){
    //   //   PrintSol(board);
    //   //   return true;
    //   // }

    //   return false;
    // }

    private void PrintSol(char[][] board){
      for(int i = 0 ; i< 9 ; i++){
        for(int j = 0 ; j < 9 ; j++){
          System.out.print(board[i][j] + " ");
        }
        System.out.println();
      }
    }
}