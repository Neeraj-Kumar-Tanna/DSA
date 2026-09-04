class Solution {
    public int firstStableIndex(int[] nums, int k) {
      int len = nums.length;
      int[] max = new int[len];
      int[] min = new int[len];

      int max_ = -1 , min_ = Integer.MAX_VALUE;

      for(int i = 0 ; i < len ; i++){
        max_ = Math.max(max_ , nums[i]);
        max[i] = max_;
        min_ = Math.min(min_ , nums[len-1-i]);
        min[len-1-i] = min_;
      }
      int val = -1;
      for(int i = 0 ;i < len ; i++){
        int temp = max[i]-min[i];
        // System.out.println(temp);
        if(temp <= k){
          // if(val==-1 || (max[val]-min[val])>temp) val = i;
          val = i ;
          break;
        }
      }
      return val;
    }
}