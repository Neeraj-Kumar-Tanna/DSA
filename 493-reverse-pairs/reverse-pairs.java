class Solution {
    int count = 0;
    int divide(int[] arr , int st , int end){
        if(st == end) return 0;
        int mid = (st+end)/2;
        divide(arr , st , mid);
        divide(arr , mid+1 , end);
        add(arr , st , mid , end );
        return count;
    }

    int BinarySearch(int[] arr , int st , int end , int target){
        int low = st , high = end , mid = (low+high)/2;
        while(low<high){
            if((long)arr[mid]*2 < target){
                low = mid+1;
                mid=(low+high)/2;
            }
            else{
                high = mid-1;
                mid = (low+high)/2;
            }
        }
        System.out.println("high : " + high + " mid : "+mid + " low : " + low);
        System.out.println("returning : " + ((long)arr[high]*2 >= target ? 0 : mid-st+1));
        return (long)arr[high]*2 >= target ? 0 : high-st;
    }

    void add(int[] arr , int st , int mid  , int end){
        System.out.println("running : " + st + " - " + mid + " - " + end );

        for(int i = st ; i <= mid ;i++){
            count += BinarySearch(arr , mid+1 , end , arr[i]);
            System.out.println("count at " + i +" " + arr[i] + " : " + count);
        }

        int i = st , j = mid+1;
        int[] temp = new int[end-st+1];
        int q = 0;
        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                temp[q++] = arr[i];
                i++;
            }
            else{
                temp[q++] = arr[j];
                j++;
            }
        }
        while(j <= end){
            temp[q++] = (arr[j]);
            j++;
        }
        while(i <= mid){
            temp[q++] = (arr[i]);
            i++;
        }

        for(int p = 0 ; p < temp.length ;p++){
            arr[st+p] = temp[p];
        }
        System.out.println("------done");
       
    }

    private int MergeSort(int[] nums , int low , int high){
        if(low == high) return 0;

        int mid = (low+high)/2;
        int l = MergeSort(nums , low , mid);
        int r = MergeSort(nums , mid+1 , high);
        int cnt = Merge(nums , low , mid , high);

        return cnt+l+r;
    }

    private int Merge(int[] nums , int low , int mid , int high){
        int pairs_cnt = 0;

        for(int i = mid+1 ; i <= high ; i++){
            long val = (long)nums[i]*2;
            pairs_cnt += mid-BinarySearch2(nums , low , mid , val);
        }

        int p1 = low , p2 = mid+1 , pntr = 0;
        int[] temp_arr = new int[high-low+1];
        while(p1 <= mid && p2 <= high){
            if(nums[p1] <= nums[p2]){
                temp_arr[pntr++] = nums[p1++];
            }
            else{
                temp_arr[pntr++] = nums[p2++];
            }
        }
        while(p1 <= mid){
            temp_arr[pntr++] = nums[p1++];
        }
        while(p2 <= high){
            temp_arr[pntr++] = nums[p2++];
        }

        for(int i = low ; i <= high ; i++){
            nums[i] = temp_arr[i-low];
        }

        // System.out.println("pc : "+pairs_cnt);

        return pairs_cnt;
    }

    private int BinarySearch2(int[] nums , int low , int high , long target){
        // System.out.print("tar " + target + " - ");
        while(low <= high){
            int mid = (low + high)/2;
            // System.out.print("mid : " + mid + "n[mid] : " + nums[mid] +" -- ");
            
            if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        // System.out.println("high :" + high);

        return high;
    }

    public int reversePairs(int[] nums) {
        
        int res = MergeSort(nums , 0 , nums.length-1);
        // System.out.println();
        // for(int cur : nums){
        //     System.out.print(cur + " ");
        // }
        return res;



        // Approach-2 O(n^2) solution------getting TLE----------


        // int rev_pair_cnt = 0;
        // System.out.println(nums.length);

        // for(int i = 0 ; i < nums.length ; i++){
        //     for(int j = i+1 ; j < nums.length ; j++){
        //         if(nums[i] > (long)nums[j]*2){
        //             rev_pair_cnt++;
        //         }
        //     }
        // }

        // return rev_pair_cnt;



        // Approach 1-kind of mergesort----------------


        // int x = divide(nums , 0 , nums.length -1);
        // count = 0;
        // return x;
    }
    
}