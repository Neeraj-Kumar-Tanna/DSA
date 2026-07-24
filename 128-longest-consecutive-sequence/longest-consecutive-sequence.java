class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int max = 1;
        for(int curr : nums){
            pq.add(curr);
        }
      
        int curr = 1;
        int value = pq.poll();
        while(!pq.isEmpty()){
            if(pq.peek() == value+1){
                curr++;
            }
            else if(pq.peek() == value){
                value = pq.poll();
                continue;
            }
            else{
                curr = 1;
            }
            value = pq.poll();
            max = Math.max(max,curr);
        }

        return max;
    }
}