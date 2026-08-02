class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int tlen = tasks.length , slen = shifts.length;

        long[] pref = new long[tlen+1];
        long sum = 0;
        for(int i = 0 ; i < tlen ; i++){
            sum += tasks[i];
            pref[i+1] = sum;
        }

        int[] ans = new int[slen];
        int low = 1 , high = tlen;
        long time = 0;
        for(int i = 0 ; i < slen ; i++){
            time += shifts[i];

            while(low <= high){
                int mid = low + (high-low)/2;
                if(pref[mid] <= time){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }

            ans[i] = tlen-low+1;

            if(low == tlen+1){
                low = 1;        
                time = 0;
            }
            high = tlen;
        }

        return ans;
    }
}