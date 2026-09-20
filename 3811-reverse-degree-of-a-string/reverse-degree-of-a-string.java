class Solution {
    public int reverseDegree(String s) {
        int res = 0;
        for(int i = 1 ; i <= s.length() ; i++){
            res += i*(26- (s.charAt(i-1)-'a'));
        }
        return res;
    }
}