class Solution {
    public int divide(int n, int m) {
        
        if(n == m) return 1;

        boolean pos = true;
        if(n <= 0 && m >0) pos = false;
        if(n >= 0 && m < 0) pos = false;

        long dividend = Math.abs((long)n);
        long divisor = Math.abs((long)m);

        long ans = 0;

        while(dividend >= divisor){
            long count = 0;

            while(dividend > (divisor<<(count+1))){
                count++;
                // System.out.println((divisor<<(count+1)) + " cnt : " + count);
            }

            ans += (1<<count);
            dividend = dividend - (divisor<<count);
            // System.out.println(dividend + " : ans " + ans + " vount : " + count);
        }
        // System.out.println(1<<31);
        if(ans > Integer.MAX_VALUE && pos == true){
            return Integer.MAX_VALUE;
        }
        if(ans > Integer.MAX_VALUE && pos == false){
            return Integer.MIN_VALUE;
        }

        return pos ? (int)ans : (int)-ans;
    }
}