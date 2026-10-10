class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int cnt = 0;
        // int st = 0;
        // for(int i = 0 ; i < g.length ; i++){
        //     st = 
        // }

        int p1 = 0 , p2 = 0;
        while(p1 < g.length && p2 < s.length){
            if(g[p1]<=s[p2]){
                cnt++;
                p1++;
                p2++;
            }
            else{
                p2++;
            }
        }

        return cnt;

    }

    private static int BS(int [] s , int st , int tar){
        int low = st , high = s.length;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(s[mid] < tar){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return low;
    }
}