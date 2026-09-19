class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int p1= 0, p2 = 0 ;
        double avg = 0;
        double res = 0;

        while(p2 < k){
            avg += nums[p2];
            p2++;
        }

        res = avg/k;

        while(p2 < nums.length){
            avg -= nums[p1];
            p1++;
            avg += nums[p2];
            p2++;

            res = Math.max(res , avg/k);
        }

        return res;
    }
}