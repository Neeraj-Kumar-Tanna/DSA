class Solution {
    public boolean isPowerOfTwo(int n) {
        int count = 0;
        while(n > 0){
            if((n&1) == 1) count++;
            n >>= 1;
        }

        return (count == 1);
        // return ((n&(n-1)) == 0 && n!=0 && n != -2147483648) ? true : false;
    }
}