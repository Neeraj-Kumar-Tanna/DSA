class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
      List<List<Integer>> res = new ArrayList<>();
      Arrays.sort(nums);
      rec(0 , new ArrayList<>() , nums , res);

      return res;
    }

    private static void rec(int ind , List<Integer> data , int[] arr , List<List<Integer>> res){
      res.add(new ArrayList<>(data));
      // if(ind == arr.length){
      //   // res.add(new ArrayList<>(data));
      //   // System.out.println("len : "+ data);
      //   return;
      // }

      for(int i = ind ; i < arr.length ; i++){
        if(i > ind && arr[i]==arr[i-1]) continue;
        // System.out.println(data);
        data.add(arr[i]);
        rec(i+1 , data , arr, res);
        data.removeLast();
      }
    }
}