class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        String res = "";
        for(int i = 0 ; i < len ; i++){
            if(len-i < res.length()) break;

            for(int j = len-1; j >= i ; j--){
                int r = j , l = i;
                boolean pal = true;
                while(l <= r){
                    if(s.charAt(l) != s.charAt(r)){
                        pal = false;
                        break;
                    }
                    l++;
                    r--;
                }
                if(pal && j-i+1 > res.length()){
                    res = s.substring(i , j+1);
                }
            }
        }
        return res;
    }
}