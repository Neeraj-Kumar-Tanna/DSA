class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0  , n = 1;
        while(k > 0){
            if(i < arr.length && n == arr[i]){
                i++;
            }
            else{
                k--;
            }
            n++;
        }
        return n-1;
    }
}