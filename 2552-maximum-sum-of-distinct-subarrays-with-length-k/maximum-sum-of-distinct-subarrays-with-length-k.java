class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int len = nums.length;
        HashMap<Integer , Integer> mp = new HashMap<>();
        int p1 = 0 , p2 = 0 ;
        long sum = 0;
        while(p2 < k){
            mp.put(nums[p2] , mp.getOrDefault(nums[p2] , 0)+1);
            sum+= nums[p2];
            p2++;
        }

        long high = 0;
        if(mp.size() == k){
            high = Math.max(sum , high);
        }

        while(p2 < len){
    
            sum-=nums[p1];
            mp.put(nums[p1] , mp.get(nums[p1])-1);
            if(mp.get(nums[p1]) == 0){
                mp.remove(nums[p1]);
            }
            p1++;

            sum += nums[p2];
            mp.put(nums[p2] , mp.getOrDefault(nums[p2] , 0)+1);
            p2++;

            if(mp.size() == k){
                high = Math.max(sum , high);
            }
        }

        return high;
    }
}