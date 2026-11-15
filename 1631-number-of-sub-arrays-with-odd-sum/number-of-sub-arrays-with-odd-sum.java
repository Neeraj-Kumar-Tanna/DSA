class Solution {
    public int numOfSubarrays(int[] arr) {
      int len = arr.length;
      int mod = 1000000007;
      int ev[] = new int[len+1];
      int pref[] = new int[len+1];
      int sum = 0;
      int evn = 0;
      for(int i = 0 ; i< len ; i++){
        sum += arr[i];
        pref[i+1] = sum;
        if(sum%2 == 0) evn++;
        ev[i+1] = evn;
      }

      long res = 0;
      for(int i = 0 ; i < len ; i++){
        int noOfEv = ev[len]-ev[i];
        if(pref[i]%2 == 0){
          res = (res + len-i-noOfEv)%mod;
        }
        else{
          res = (res + noOfEv)%mod;
        }
      }

      return (int)res;
    }
}