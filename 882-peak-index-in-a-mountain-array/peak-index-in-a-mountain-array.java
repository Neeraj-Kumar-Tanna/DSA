class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int len = arr.length;
        int low = 0 , high = len-1;
        while(low < high){
            int mid = low + (high-low)/2;
            if(arr[mid+1] < arr[mid] && arr[mid-1] < arr[mid]){
                return mid;
            }
            else if(arr[mid+1] < arr[mid]){
                high = mid;
            }
            else if(arr[mid-1] < arr[mid]){
                low = mid;
            }
        }
        return -1;
    }
}