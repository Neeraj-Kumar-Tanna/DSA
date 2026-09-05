class Solution {
    public int firstStableIndex(int[] nums, int k) {
      int len = nums.length;
      int[] max = new int[len];
      int[] min = new int[len];

      int ma = -1 , mi = Integer.MAX_VALUE;
      
      for(int i = 0 ; i < len ; i++){
        ma = Math.max(nums[i] , ma);
        max[i] = ma;
        mi = Math.min(nums[len-1-i],mi);
        min[len-1-i] = mi;
      }

      for(int i = 0; i < len ; i++){
        int temp = max[i]-min[i];
        if(temp <= k) return i;
      }

      return -1;
    }
}