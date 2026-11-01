class Solution {
    public int[] plusOne(int[] digits) {
        int len_dig = digits.length;

        int carry = (digits[len_dig-1]+1)/10;
        digits[len_dig-1] = (digits[len_dig - 1] + 1)%10;

        int i = len_dig-2;
        while(i >= 0 && carry == 1){
            carry = (digits[i]+1)/10;
            digits[i] = (digits[i]+1)%10;
            i--;
        }

        if(carry == 1){
            int[] res = new int[len_dig+1];
            res[0] = 1;
            return res;
        }

        return digits;
    }
}