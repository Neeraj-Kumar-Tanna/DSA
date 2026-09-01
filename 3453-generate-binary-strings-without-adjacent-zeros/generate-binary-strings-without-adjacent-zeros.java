class  Solution {
  public static List<String> res = new ArrayList<>();
    public List<String> validStrings(int n) {
      List<String> res = new ArrayList<>();
      rec2(n , "" , res);

      return res;


      // ----------------Approach#2-----------------------------------

      // StringBuilder sb = new StringBuilder();
      // rec(n, "");
      // List<String> temp = new ArrayList<>(res);
      // res.clear();

      // return temp;



        //----------Approach#1----------------------------------------

        // for(int i = 0 ; i < (1<<n) ; i++){
        //   // boolean isz = (i&1)==0 ? true : false;
        //   StringBuilder sb = new StringBuilder(Integer.toBinaryString(i));
        //   while(sb.length() < n){
        //     sb.insert(0,'0');
        //   }

        //   // if(!sb.contains("00")){
        //   //   res.add(sb.toString());
        //   // }

        //   boolean cont = false;
        //   for(int k = 0 ; k < n-1 ; k++){
        //     if(sb.substring(k , k+2).equals("00")){
        //       cont = true;
        //       break;
        //     }
        //   }

        //   if(!cont){
        //     res.add(sb.toString());
        //   }
        // }
        // return res;
    }

  public static void rec2(int n , String s , List<String> res){
    if(n == 0){
      res.add(s);
      return;
    }

    rec2(n-1 , s+"1" , res);

    if(s.length() == 0 || (s.length() > 0 && s.charAt(s.length()-1) == '1')){
      rec2(n-1, s+'0' , res);
    }

  }

  public static void rec(int n , StringBuilder sb){
    if(n == 0){
      res.add(sb.toString());
      return;
    }
    if(sb.length()==0 || (sb.length() > 0 && sb.charAt(sb.length()-1) == '1')){
      // System.out.println("inside if = 1");
      StringBuilder a = new StringBuilder(sb);
      a.append('0');
      rec( n-1 , a);
      StringBuilder b = new StringBuilder(sb);
      b.append('1');
      rec(n-1 ,b);
    }
    else{
      StringBuilder b = new StringBuilder(sb);
      b.append('1');
      rec(n-1 , b);
    }
  }

  // public static List<String> rec2(int n , StringBuilder sb){
  //   if(n == 0){
  //     return sb.toString();
  //   }
    
  //   return 
  // }
}