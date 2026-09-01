class Solution {
  public List<String> generateParenthesis(int n) {
    List<String> res = new ArrayList<>();
    rec1(n , n , "" , res);
    return res;
  }

  private static void rec1(int l , int r , String s , List<String> res){
    // System.out.println("l : "+l + " r : "+r+" s : "+s);
    if(l == 0 && r == 0){
      res.add(s);
      return;
    }

    if(l>0){
      rec1(l-1 , r , s+"(" , res);
    }

    if(l < r){
      rec1(l , r-1 , s+")" , res);
    }
  }
}