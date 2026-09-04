class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      Arrays.sort(candidates);
      List<List<Integer>> res = new ArrayList<>();
      rec(0 , target ,new ArrayList<>(), candidates , res);

      return res;
    }

    private static void rec(int ind , int target ,List<Integer> data , int[] arr , List<List<Integer>> res){
      if(target == 0){
        // System.out.println(ind + " : " + target + " : " + data);
        res.add(new ArrayList<>(data));
        return ;
      }
      
      for(int i = ind ; i < arr.length ; i++){
        if(i > ind && arr[i]==arr[i-1]) continue;
        if(arr[i] > target) break;

        data.add(arr[i]);
        rec(i+1 , target-arr[i] ,data ,  arr , res);
        data.removeLast();
        // System.out.println(ind);
      }
    }
}