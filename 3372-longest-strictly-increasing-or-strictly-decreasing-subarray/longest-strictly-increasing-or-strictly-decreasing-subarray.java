class Solution {
    public int longestMonotonicSubarray(int[] nums) {
      int len = nums.length;
      if(len == 1){
        return 1;
      }

      int max = 1;
      int cnt = 1;
      int p1 = 0 , p2 = 1;

      while(p2 < len){
        // if((nums[p2]-nums[p2-1] < 0) && (nums[p1+1]-nums[p1] < 0)){
        //   cnt++;
        // }
        // else if((nums[p2]-nums[p2-1] > 0) && (nums[p1+1]-nums[p1] > 0)){
        //   cnt++;
        // }
        // else{
        //   max = Math.max(max , (p2-p1));
        //   p1 = p2-1;
        // }

        if(((nums[p2]-nums[p2-1] < 0) && (nums[p1+1]-nums[p1] > 0)) || ((nums[p2]-nums[p2-1] > 0) && (nums[p1+1]-nums[p1] < 0))){
          max = Math.max(max , (p2-p1));
          p1 = p2-1;
        }
        else if(nums[p2] == nums[p2-1]){
          max = Math.max(max , (p2-p1));
          p1 = p2;
        }

        p2++;
      }

      max = Math.max(max ,(p2-p1));

      return max;
    }
}