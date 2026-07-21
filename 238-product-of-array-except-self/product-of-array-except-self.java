class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int[] p = new int[len];
        int[] s = new int[len];
        int pp = 1 , ss = 1;

        for(int i = 0; i < len ; i++){
            pp *= nums[i];
            ss *= nums[len-1-i];
            p[i] = pp;
            s[len-1-i] = ss;
        }

        int answer[] = new int[len];
        answer[0] = s[1];
        answer[len-1] = p[len-2];
        for(int i = 1 ;i < len-1 ; i++){
            answer[i] = p[i-1]*s[i+1];
        }

        return answer;
    }
}