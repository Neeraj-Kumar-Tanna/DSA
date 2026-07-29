class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0 , r = arr.length-1;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(mid >= arr.length){
                l = arr.length;
                System.out.println("breaked here");
                break;
            }
            else if(arr[mid]-(mid+1) >= k){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        System.out.println("l : " + l + " r : " + r);
        int res = -1;
        if(r == -1){
            res = k;
        }
        else{
            res = arr[l-1] + k-(arr[l-1]-l);      
        }

        // System.out.println(res);
        return res;
    }
}