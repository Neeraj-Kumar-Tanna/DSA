class Solution {
    public int[] singleNumber(int[] nums) {
        int x = 0;
        boolean found = false;
        int res1 = 0 , res2 = 0;
        int shift = 0;
        while(!found){
            for(int cur : nums){
                x = x^((cur>>shift)&1);
            }
            if(x == 1){
                for(int cur : nums){
                    if(((cur>>shift)&1) == 1){
                        res1 ^= cur;
                    }
                    else{
                        res2^= cur;
                    }
                }
                System.out.println(res1 + " " + res2 + " " + shift);

                return new int[]{(res1) , (res2)};
            }
            System.out.println(shift + " x : " + x);
            shift++;
            x= 0;
        }
        
        return new int[]{-1, -1};
    }
}