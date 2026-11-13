class Solution {
    public boolean canJump(int[] nums) {
      boolean[] poss = new boolean[nums.length];
      int nearest_true = nums.length-1;
      for(int i = nums.length - 2 ; i >= 0 ; i--){
        if(i+nums[i] >= nearest_true ){
          // pos[i] = true;
          nearest_true = i; 
        }
        // else{
        //   // nums[i] = false;
        // }
      }

      if(nearest_true <= nums[0]) return true;
      return false;

      //-----Approach-1----rec----TLE----
      // boolean res = rec(0 , nums);
      // return res;
    }

  private static boolean rec(int cur , int[] nums){
    System.out.println(cur);
    if(cur >= nums.length-1){
      return true;
    }
    if(nums[cur] == 0) return false;

    for(int i = nums[cur] ; i > 0 ; i--){
      if(rec(cur+i , nums) == true) return true;
    }

    return false;
  }
}