class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<>();
        
        for(int i = 1 ; i <= num.length() ; i++){
          rec(i , Long.valueOf(num.substring(0 , i)) , target , num.substring(0 , i) , Long.valueOf(num.substring(0 , i)) , num , res);
          if(num.charAt(0) == '0') break;
        }
        // long cnt = rec(0 , 0 , target ,"",0 , num);

        // System.out.println(cnt);
        // System.out.println(Integer.valueOf("999"));
        //num = "3456237490" , tar = 9191
        // System.out.println(res.size());

        return res;
    }

    private void rec(int cur,long sum , int target ,String str, long prev , String num , List<String> res){
      if(cur == num.length()){
        if(sum == target){
          // System.out.println("sum : "+ sum + " true" + "str : "+ str);
          res.add(str);
          return ;
        }
        else{
          // System.out.println("sum : "+ sum + " false");
          return ;
        }
      }
      long a1 = 0 , b1 = 0 , c1 = 0;
      for(int i = cur+1 ; i <= num.length() ; i++){
        String s = num.substring(cur , i);
        long a = sum + Long.valueOf(num.substring(cur , i));
        long b = sum - Long.valueOf(num.substring(cur , i));
        long c = sum +prev*Long.valueOf(s) - prev;
        
        rec(i , a , target ,str+"+"+s,Long.valueOf(s),  num , res);
        rec(i , b , target ,str+"-"+s, -1*Long.valueOf(s), num , res);
        rec(i , c , target ,str+"*"+s , prev*Long.valueOf(s), num , res);

        if(num.charAt(cur) == '0') break;
      }
      
      // System.out.println("cur : "+ cur +" a1 : " + a1 + " b1 : " + b1 + " c1 : " + c1);
       
    }
}