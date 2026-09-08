class Solution {
    public int countCommas(int n) {
        // if(n < 1000) return 0;

        // int len = 0;
        // int temp = n;
        // while(temp > 0){
        //     len++;
        //     temp = temp/10;
        // }

        // len -= 4;
        // int res = 0;
        // int prev = 9000;
        // for(int i = 0 ; i < len ; i++){
        //     res = res*10 + prev;
        //     prev = res;
        //     System.out.println(i + " " + res);
        // }
        // System.out.println(res);
        return n-999>0 ? n-999 : 0;
    }
}