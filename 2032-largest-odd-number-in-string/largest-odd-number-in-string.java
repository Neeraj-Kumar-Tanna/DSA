class Solution {
    public String largestOddNumber(String num) {
        for(int i = num.length()-1; i >= 0 ; i--){
            if((int)num.charAt(i)%2 == 0){
                continue;
            }
            return new String(num.substring(0 , i+1));
        }

        return "";
    }
}