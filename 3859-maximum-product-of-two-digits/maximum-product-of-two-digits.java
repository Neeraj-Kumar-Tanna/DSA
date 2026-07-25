class Solution {
    public int maxProduct(int n) {
        int f= 0;
        int s = 0;
        while(n > 0){
            int temp = n%10;
            if(temp > f){
                s =f ;
                f = temp;
            }
            else if(temp > s){
                s = temp;
            }
            n /= 10;
        }

        return f*s;
    }
}