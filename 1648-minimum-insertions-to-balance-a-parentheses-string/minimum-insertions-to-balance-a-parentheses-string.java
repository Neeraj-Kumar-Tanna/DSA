class Solution {
    public int minInsertions(String s) {
        int len = s.length();
        List<Integer> temp = new ArrayList<>();

        int i = 0;
        int req = 0;

        while(i < len){
            if(s.charAt(i) == '('){
                temp.add(1);
                i++;
            }
            else{
                temp.add(-1);
                if(i+1 < len && s.charAt(i+1) == ')'){
                    i+=2;
                }
                else{
                    req++;
                    i++;
                }
            }
        }

        int cnt = 0;

        for(int cur : temp){
            // System.out.print(cur + " ");
            cnt += cur;
            if(cnt < 0){
                req += 1;
                cnt = 0;
            }
        }
        req += cnt*2;
        // System.out.println("\n"+req + " ");
        return req;

        // int l = 0 , r = 0 ;
        // int req = 0;

        // int j = 0;
        // while(j < s.length()){
        //     if(s.charAt(j) == '('){
        //         l++;
        //         j++;
        //     }
        //     else{
                // if(j+1 < s.length() && s.charAt(j+1) == ')'){
                //     r += 2;
                //     j+=2;
                // }
                // else{
                //     r++;
                //     req++;
                //     j++;
                // }
        //     }
        // }

        // for(int i = 0 ; i < s.length() ; i++){
        //     if(s.charAt(i) == '(') l++;
        //     else r++;
        // }

        // System.out.println("l:"+l +" r : "+r + " req : " + req);
        // return 0;
    }
}