class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        int max = 0;
        String res = "";

        for(int i = 0; i < len; i++){
            //odd
            int l = i , r = i;
            while(l >= 0 && r < len && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }

            if(r-l-1 > max){
                max = r-l-1;
                res = s.substring(l+1 , r);
            }
            

            //even
            l=i;
            r = i+1;
            while(l >= 0 && r < len && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }

            if(r-l-1 > max){
                max = r-l-1;
                res = s.substring(l+1 , r);
            }
        }

        return res;
    }
}