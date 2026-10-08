class Solution {
    public String removeOuterParentheses(String s) {
        // StringBuilder res = new StringBuilder();
        String res = "";

        int l = 0 , r = 0 , cnt = 0;

        while(r < s.length()){
            if(s.charAt(r) == '(') cnt++;
            else cnt--;

            if(cnt == 0){
                // res.append(s.substring(l+1 , r));
                res = res + s.substring(l+1 , r);
                l = r+1;
            }
            r++;
        }

        return res;
    }
}