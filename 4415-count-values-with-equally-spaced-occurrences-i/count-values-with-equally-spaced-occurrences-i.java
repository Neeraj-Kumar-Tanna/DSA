class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashSet<Integer> ck = new HashSet<>();
        int res = 0;

        for(int i = 0 ;i < nums.length ; i++){
            if(!ck.contains(nums[i])){
                int cnt = 0;
                List<Integer> li = new ArrayList<>();
                for(int j = i ; j < nums.length ; j++){
                    if(nums[j] == nums[i]){
                        cnt++;
                        li.add(j);
                    }
                }

                if(cnt==3 && (li.get(1)-li.get(0)) == (li.get(2)-li.get(1))){
                    res++;
                }
            }
            ck.add(nums[i]);
        }

        return res;
    }
}