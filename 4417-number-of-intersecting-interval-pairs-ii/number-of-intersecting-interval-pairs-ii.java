class Solution {
    public long countIntersectingIntervals(int[][] nums) {
        long res = 0;
        // ArrayList<Integer , Integer> arr = new ArrayList<>();
        Arrays.sort(nums , (a , b)->{
            if(a[0] > b[0]) return 1;
            else if(a[0] < b[0]) return -1;
            return 0;
        });

        for(int i = 0 ; i < nums.length ; i++){
            res += bs(nums , i) - i ;
        }

        return res;

        // for(int i = 0 ; i < nums.length ; i++){
        //     int x = bs(arr , nums[i][0]);
        //     if(x == -1){
        //         ArrayList<Integer , Integer> temp = new ArrayList<>();
        //         temp.add(nums[i][0]);
        //         temp.add(nums[i][1]);
        //         arr.add(temp);
        //     }
        //     else if(nums[i][0] <= arr.get(x).get(1)){
        //         arr.get(x).set(Math.max(nums[i][1] , arr.get(x).get(1)));
        //     } 
        // }
    }


    private static int bs(int[][] nums , int low){
        int tar = nums[low][1];
        int high = nums.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid][0] <= tar) low = mid+1;
            else high = mid-1;
        }

        return high;
    }
}