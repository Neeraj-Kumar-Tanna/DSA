class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0  , r = nums.length-1;
        int count = 0;
        while(l < r){
            int temp = nums[l]+nums[r];
            if(temp == k){
                count++;
                l++;
                r--;
            }
            else if(temp < k) l++;
            else r--; 
        }
        return count;
    }
}