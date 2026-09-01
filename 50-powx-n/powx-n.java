class Solution {
    public double myPow(double x, int a) {
        long n = a;
        if(n < 0){
            n = (long)Math.abs(n);
            return 1/pow(x , x , n);
        }

        return pow(x ,x, n);
    }

    public static double pow(double x ,double a , long n){
        if(n <= 0){
            return 1;
        }

        if((n&1)==1){
          n >>= 1;
          return a*pow(x , a*a , n);
        }
        n >>= 1;

        return pow(x , a*a , n);
    }
}