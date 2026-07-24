class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        int max = 1;
        Set<Integer> s = new HashSet<>();
        for(int curr : nums){
            s.add(curr);
        }

        for(int curr : s){
            if(!s.contains(curr-1)){
                int count = 1;
                int x = curr;
                while(s.contains(x+1)){
                    count++;
                    x++;
                }
                max = Math.max(max , count);
            }
        }

        return max;
    }
}