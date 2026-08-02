class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;

        int[] pref = new int[n+1];
        int high = 0;
        for(int i = 0;  i < n; i++){
            high += nums[i];
            pref[i+1] = high;
        }
        int low = 0;
        while(low <= high){
            int mid = low + (high-low)/2;

            int temp = 0 , count = 1;
            int  i = 1;
            while(i <= n && count <= k){
                if(pref[i]-pref[temp] <= mid){
                    i++;
                }
                else{
                    count++;
                    temp =i-1;
                }
            }
            
            if(count <= k){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}