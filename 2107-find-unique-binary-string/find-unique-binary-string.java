class Solution {
    public String findDifferentBinaryString(String[] nums) {
      int n = nums[0].length();
      int len = nums.length;
      // Arrays.sort(nums , (a,b)->{
      //   for(int i = 0 ; i < n ; i++){
      //     if(a.charAt(i) == b.charAt(i)) continue;
      //     else if(a.charAt(i) > b.charAt(i)) return 1;
      //     else return -1;
      //   }
      // });
      Arrays.sort(nums);
      for(String cur : nums){
        System.out.println(cur);  
      }
      int ind = 0;
      for(int i = 0 ; i < (1<<n) ; i++){
        String s = new String(Integer.toBinaryString(i));
        while(s.length() < n){
          s = "0"+s;
        }

        if(ind >= len || !s.equals(nums[ind])) return s;

        ind++;
      }

      return "abc";
    }
}