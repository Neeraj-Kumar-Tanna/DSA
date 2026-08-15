class Solution {
    public double myPow(double x, int m) {
        // double a = x;
        // double res = 1;
        // boolean isNeg = false;
        // if(m < 0){
        //     isNeg = true;
        // }

        // long n = m;
        // n = Math.abs(n);

        // while(n > 0){
        //     if((n&1) == 1){
        //         res = res*a;
        //     }
        //     n >>= 1;
        //     a = a*a;
        //     System.out.println(a + "  : "+ res);
        // }

        // if(isNeg){
        //     return 1/res;
        // }

        //----------------------------

        
        if(m < 0){
            double n = m;
            n = Math.abs(n);

            double res = Math.pow(x , n);
            return 1/res;
        }
        double n = m;
        n = Math.abs(n);
        return (double)Math.pow(x, n);
    }
}

