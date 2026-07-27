class Solution {
    public int maxProduct(int[] nums) {
        int f = 0 , s = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > f){
                s = f;
                f = nums[i];
            }
            else if(nums[i] > s){
                s = nums[i];
            }
        }

        return (f-1)*(s-1);
    }
}