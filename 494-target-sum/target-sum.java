class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return cnt(0 , 0 , nums.length , nums , target);
    }

    private int cnt(int ind , int sum , int len , int[] nums , int target){
      if(ind == len){
        if(sum == target) return 1;
        return 0;
      }

      int l = cnt(ind+1 , sum+nums[ind] , len , nums , target);
      int r = cnt(ind+1 , sum-nums[ind] , len , nums , target);
      
      return l+r;
    }
}