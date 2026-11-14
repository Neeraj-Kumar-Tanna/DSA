class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
      int len = nums.size();
      int[] pref = new int[len+1];
      int sum = 0;
      for(int i = 0 ; i < len ; i++){
        sum+= nums.get(i);
        pref[i+1] = sum;
      }

      int min = Integer.MAX_VALUE;

      for(int i = l ; i <= r ; i++){
        for(int j =  i; j < len+1 ; j++){
          if(pref[j]-pref[j-i] > 0){
            min = Math.min(min , pref[j]-pref[j-i]);
          }
        }
      }

      return min != Integer.MAX_VALUE ? min : -1;
    }
}