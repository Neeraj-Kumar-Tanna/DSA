class Solution {
    public int singleNumber(int[] nums) {

        int[] bit_cnt = new int[32];
        int len = nums.length;

        for(int i = 0 ;i < len ; i++){
            int temp = nums[i];
            int pos = 0;
            for(int j = 0 ; j < 32 ; j++){
                if((temp&1) == 1){
                    bit_cnt[j]++;
                }
                // pos++;
                temp >>= 1;
            }
        }

        int res = 0;
        
        // String str2 = "";
        for(int i = 0 ; i < 32 ; i++){
            
           
            // System.out.print(bit_cnt[i] + " ");
            bit_cnt[i] = bit_cnt[i]%3;

            if(bit_cnt[i] == 1){
                res = (res|(1 << i));  
            }

        }

        System.out.println( "\n"+ (1<<0));
        // String str = Arrays.toString(bit_cnt);
        // System.out.println(str);
        // System.out.println(str2);

        // int res1 = Integer.parseInt(str2 , 2);

        return res;




        // int[] cnt = new int[32];
        // for(int i = 0 ; i < nums.length ; i++){
        //     int num = nums[i];
            
        //     for(int j = 0 ; j < 32 ; j++){
        //         if((num&(1<<j)) == 1){
        //             cnt[j]++;
        //         }
        //     }
        // }

        // for(int i= 0 ; i < 32 ; i++){
        //     cnt[i] = cnt[i]%3;
        // }

        // int res = 0;
        // int pow = 1;

        // for(int i = 0 ; i < 32 ; i++){
        //     System.out.print(cnt[i] + " ");
        // }

        // return 0;
    }
}