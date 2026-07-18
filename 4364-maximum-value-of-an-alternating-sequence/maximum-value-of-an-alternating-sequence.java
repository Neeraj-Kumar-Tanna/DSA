class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n == 1) return s;
        if(n%2 == 1){
            n -= 1;
        }
        
        long mx = (long)s + ((n/2)*(long)m) - ((n/2)-1);
        // long mx = s;
        // long temp = s;
        // for(int i = 1 ; i < n ; i++){
        //     if(i%2 == 1){
        //         temp += m;
        //         mx = Math.max(temp , mx);
        //     }
        //     else{
        //         temp -= 1;
        //     }
        // }

        return mx;
    }
}