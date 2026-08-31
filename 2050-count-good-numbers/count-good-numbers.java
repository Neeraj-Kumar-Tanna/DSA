class Solution {
    public static int mod = 1000000007;
    public int countGoodNumbers(long n) {
        if(n == 1 ) return 5;

        long ans = -1;
        if((n&1) == 1){
          ans = (rec((n-1)/2 )*5)%mod;
        }
        else{
          ans = rec(n/2);
        }

        return (int)ans;
    }

    public static long rec(long n){
        // System.out.println("n : "+ n);
        if(n == 1) return 20;

        long temp = (rec(n/2))%mod;

        // return (temp*temp)%mod;
        if(n%2 == 1){
          return (((temp*temp)%mod)*20)%mod;
        }
        
        return (temp*temp)%mod;
    }
}