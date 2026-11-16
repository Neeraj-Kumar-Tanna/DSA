class Solution {
    public String digitSum(String s, int k) {
      
      while(s.length() > k){
        String temp = "";
        
        for(int i = 0 ; i < s.length() ; i = i+k){
          String temp2 = s.substring(i , Math.min(i+k , s.length()));
          int sum = 0;
          for(int j = 0 ; j < temp2.length() ; j++){
            sum += (temp2.charAt(j) - '0');
          }
          temp += sum;
        }

        s = temp;
      }

      return s;
    }
}