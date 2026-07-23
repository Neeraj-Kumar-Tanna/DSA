class Solution {
    public int longestOnes(int[] nums, int k) {
        int len = nums.length;
        int max = 0;
        int curr = 0 , l = 0;
        
        for(int i = 0;  i < len ; i++){
            if(nums[i] == 0){
                curr++;
            }
            
            while(curr > k){
                if(nums[l] == 0){
                    curr--;
                }
                l++;
            }

            max = Math.max(max, i - l + 1);
        }
        return max;
    }
}