class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        int len = nums.length;
        for(int i = len - 2 ; i >= 0 ; i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }

        // if(ind == -1){
        //     Arrays.sort(nums);
        //     return;
        // }


        if(ind != -1){
            for(int i = len-1 ; i > ind ; i-- ){
            // if(ind == -1) break;
            if(nums[i] > nums[ind]){
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
                break;
            }
            }
        }
        // else{
        //     ind = 0;
        // }


        // for(int i = len-1 ; i > ind ; i-- ){
        //     if(ind == -1) break;
        //     if(nums[i] > nums[ind]){
        //         int temp = nums[i];
        //         nums[i] = nums[ind];
        //         nums[ind] = temp;
        //         break;
        //     }
        // }

        for(int i = 0 ; i < (len-ind)/2 ; i++){
            int temp = nums[i+ind+1];
            nums[i+ind+1] = nums[len-1-i];
            nums[len-1 - i] = temp;
        }
        
    }
}