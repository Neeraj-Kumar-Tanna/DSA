class Solution {
    public int minOperations(int[] nums, int x) {
        int len = nums.length;
        int pref[] = new int[len+1];
        int suff[] = new int[len+1];
        int p = 0 , s = 0;

        for(int i = 0 ; i < len ; i++){
            p+=nums[i];
            s+= nums[len-1-i];

            pref[i+1] = p;
            suff[len-i-1] = s;
        }

        // for(int cur : pref) System.out.print(cur + " ");
        // System.out.println();
        // for(int cur : suff) System.out.print(cur + " ");

        int l = 0;
        int res = len+1;

        while(l < len+1){
            if(res < l) break;
            if(pref[l] > x) break;

            int req = x - pref[l];
            int ind = bs(suff , l , req );
            // System.out.println(l + " : " + ind);
            if(suff[ind] == req){
                res = Math.min(res , l+len-ind);
            }

            l++;
        }
        
        return res == len+1 ? -1 : res;
    }

    private static int bs(int[] suff , int l  , int req ){
        int low = l , high = suff.length-1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(suff[mid] > req){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        //max : len , min : l;
        return low;
    }
}