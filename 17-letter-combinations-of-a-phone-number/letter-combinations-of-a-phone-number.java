class Solution {
    public List<String> letterCombinations(String digits) {
      String[] arr = {"abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
      List<String> res  = new ArrayList<>();
      int[] ind=  new int[digits.length()];
      rec2(0 ,"" ,  res ,arr , digits);
      // System.out.println('2'-'');
      return res;
    }

    private static void rec2(int i ,String s , List<String> res , String[] arr , String digits){
      if(s.length() == digits.length()){
        res.add(new String(s));
        return;
      }

      char digit = digits.charAt(i);
      String temp = arr[digit-'2'];
      for(int j = 0 ; j < temp.length() ; j++){
        rec2(i+1 , s+temp.charAt(j) , res , arr , digits);
      }
    }

    private static void rec(int i , int[] ind , String s, String[] arr , List<String> res , String digits){
      if(s.length() == digits.length()){
        res.add(new String(s));
        return;
      }
      String temp = arr[digits.charAt(i)-'2'];
      // char ch = arr[digits.charAt(i)-'2'].charAt(ind[i]);
      // System.out.println(ch);
      // ind[i] = ind[i]+1;

      for(int j = 0 ; j < temp.length() ; j++){
        char ch = temp.charAt(ind[j]);
        ind[j] = ind[j]+1;
        rec(j+1 , ind , s+ch , arr , res ,  digits);
        ind[j] = ind[j]-1;
      }


    }
}