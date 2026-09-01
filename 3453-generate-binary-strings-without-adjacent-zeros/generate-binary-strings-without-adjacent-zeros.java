class Solution {
    public List<String> validStrings(int n) {
      List<String> res = new ArrayList<>();
        for(int i = 0 ; i < (1<<n) ; i++){
          // boolean isz = (i&1)==0 ? true : false;
          StringBuilder sb = new StringBuilder(Integer.toBinaryString(i));
          while(sb.length() < n){
            sb.insert(0,'0');
          }

          // if(!sb.contains("00")){
          //   res.add(sb.toString());
          // }
          boolean cont = false;
          for(int k = 0 ; k < n-1 ; k++){
            if(sb.substring(k , k+2).equals("00")){
              cont = true;
              break;
            }
          }

          if(!cont){
            res.add(sb.toString());
          }
        }

        return res;
    }
}