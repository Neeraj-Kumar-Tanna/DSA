class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        int len = nums.length;
        for(int i = 0 ; i < (1<<len) ; i++){
            int temp = i;
            int j = len-1;
            List<Integer> subset = new ArrayList<>();
            while(temp > 0){
                if((temp&1) == 1){
                    subset.add(nums[j]);
                }
                temp>>=1;
                j--;
            }
            res.add(subset);
        }

        return res;
    }
}