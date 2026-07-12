class Solution {
    public int minimumCost(int[] nums, int k) {
        int  mod = 1000000007;
        long temp = k;
        long cost = 1;
        long minCost = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > temp){
                long req = nums[i]-temp;
                // System.out.print("temp : " + temp + "  ");
                // System.out.print("req" + req + "  ");
                long count = (req + k-1)/k;
                // System.out.print("count" + count + "  ");
                temp += count*k;
                // System.out.print("temp : " + temp);
                // for(int j  = 0 ; j < count ;j++){
                //     minCost = (minCost + cost%mod)%mod;
                //     cost++;
                // }
                // minCost = (minCost +  ((long)(((float)count/2)*((2*cost)+(count-1))))%mod)%mod;
                long f = cost;
                // long l = 2*cost+count-1;
                // if(f%2 == 0){
                //     f /= 2;
                // }
                // else{
                //     l/=2;
                // }
                // minCost = (minCost + ((f+l)%mod))%mod;
                // cost += count;

                long a = count;
                long b = 2L * cost + count - 1;

                if ((a & 1) == 0) {
                    a /= 2;
                } else {
                    b /= 2;
                }

                long sum = ((a % mod) * (b % mod)) % mod;

                minCost = (minCost + sum) % mod;
                cost += count;
                // System.out.println("minCost : " + minCost + " cost : " + cost);

            }
            temp -= nums[i];
        }
        return (int)minCost;
    }
}