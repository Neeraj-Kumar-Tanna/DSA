class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int l = 0 , r = len-1;
        int max = 0 ;
        while(l < r){
            max = Math.max(max , (r-l)*(Math.min(height[r] , height[l])));
            if(height[r] > height[l]){
                l++;
            }
            else r--;
        }
        return max;
    }
}