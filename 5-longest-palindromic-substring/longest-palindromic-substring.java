class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        String res = "";
        for(int i = 0 ; i < len ; i++){
            //odd
            int p1 = i , p2 = i;
            while(p1 >= 0 && p2 < len && s.charAt(p1) == s.charAt(p2)){
                if(res.length() < (p2-p1+1)){
                    res = s.substring(p1 , p2+1);
                }
                p1--;
                p2++;
            }

            //even
            p1 = i ;
            p2 = i+1;
            while(p1 >= 0 && p2 < len && s.charAt(p1) == s.charAt(p2)){
                if(res.length() < (p2-p1+1)){
                    res = s.substring(p1 , p2+1);
                }
                p1--;
                p2++;
            }
        }

        return res;
    }
}