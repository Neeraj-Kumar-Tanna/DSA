class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      Arrays.sort(candidates);
      List<List<Integer>> res = new ArrayList<>();
      rec(0 ,0 , target ,new ArrayList<>(), candidates , res);

      return res;
    }

    private static void rec(int ind ,int sum, int target ,List<Integer> data , int[] arr , List<List<Integer>> res){
      // if(ind == arr.length){
      //   System.out.println("Hii..");
      // }
      if(target == sum){
        res.add(new ArrayList<>(data));
        return ;
      }
      
      for(int i = ind ; i < arr.length ; i++){
        if(i > ind && arr[i]==arr[i-1]) continue;
        if(sum > target) break;

        data.add(arr[i]);
        rec(i+1 , sum+arr[i] , target , data ,  arr , res);
        data.removeLast();
      }
    }
}