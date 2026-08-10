class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0; i < n+1 ; i++){
            ans[i] = no(i);
        }
        return ans;
    }

    int no(int n ){
        int count = 0;
        while(n > 0){
            count++;
            n = n&(n-1);
        }

        return count;
    }
}