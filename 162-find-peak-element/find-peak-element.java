class Solution {
    public int findPeakElement(int[] a) {
        int l=0,h=a.length-1;

        while(l<h){
             int mid=(l+h)/2;
             if(a[mid]>a[mid+1])
             {
                h=mid;
             }
             else {
                l=mid+1;
             }
        }
        return l;
        
    }
}