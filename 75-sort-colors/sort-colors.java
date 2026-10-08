class Solution {
    void swap(int[] arr , int i1 , int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    public void sortColors(int[] nums) {

        int l = 0 , r = nums.length-1 ;

        while(l < r){
            if(nums[l] == 0) l++;
            else if(nums[r] == 2) r--;
            else{
                if(nums[l] == 2 || nums[r] == 0){
                    swap(nums , l , r);
                }
                else{
                    int cur = l+1;
                    while(cur < r){
                        if(nums[cur] == 0){
                            swap(nums, l , cur);
                            break;
                        } 
                        else if(nums[cur] == 2){
                            swap(nums , cur , r);
                            break;
                        }
                        cur++;
                    }
                    if(cur == r) return;
                }
            }
            // else{
            //     if(nums[l] > nums[r]){
            //         swap(nums , l , r);
            //     }
            //     else{
            //         int cur = l+1;
            //         while(cur < r){
            //             if(nums[cur] < nums[l]){
            //                 swap(nums , cur , l);
            //                 break;
            //             }
            //             else if(nums[cur] > nums[r]){
            //                 swap(nums, cur , r);
            //                 break;
            //             }
            //             cur++;
            //         }
            //         if(l == r) return ;
            //     }
            // }
        }
        
        return;







        // int i = 0; 
        // int j = nums.length-1;

        // while(i <  j && nums[i] == 0){
        //     i++;
        // }
        // while(j > -1 && nums[j] == 2){
        //     j--;
        // }
        
        // int k = i;

        // while( i < j && k <= j ){
        //     if(nums[k] < nums[i]){
        //         swap(nums , k , i);
        //     }
        //     else if(nums[k] > nums[j]){
        //         swap(nums , k ,j);
        //     }
        //     else k++;

        //     while(nums[i] == 0){
        //         i++;
        //         k = i;
        //     }
        //     while(nums[j] == 2){
        //         j--;
        //     }
        // }















        // if(nums.length == 1){
        //     return;
        // }
        
        // int l = 0 , r = nums.length-1 ;
        // // while(nums[l] == 0 && l < nums.length) l++;
        // // while(nums[r] == 2 && r >= 0) r--;
        // int mid = l+1;

        // while(mid <= r){
        //     if(nums[l] > nums[r]){
        //         swap(nums , l , r);
                
        //     }
        //     else if(nums[mid] == 0){
        //         swap(nums , mid , l);
        //     }
        //     else if(nums[mid] == 2){
        //         swap(nums , mid , r);
        //     }
        //     else{
        //         mid++;
        //     }
        //     while(nums[l] == 0 && l < nums.length) l++;
        //     while(nums[r] == 2 && r >= 0) r--;
        //     if(mid <= l ) mid = l+1;
        // }







        // int l = 0 , r = nums.length-1 , mid = l;
        // while(l < r){
        //     if(nums[l] > nums[r]){
        //         nums[l] = nums[l] + nums[r] - (nums[r] = nums[l]);
        //     } 
        //     else if(nums[l] > nums[mid]){
        //         nums[l] = nums[l] + nums[mid] - (nums[mid] = nums[l]);
        //     }
        //     else if(nums[r] < nums[mid]){
        //         nums[r] = nums[r] + nums[mid] - (nums[mid] = nums[r]);
        //     }
        //     else{
        //         mid++;
        //     }

        //     if(mid == r){
        //         l++;
        //         mid = l;
        //     }


        //     while(nums[l] == 0){
        //             l++;
        //             mid = l;
        //         }
        //         while(nums[r] == 2){
        //             r--;
        //         }
        // }
    }
}