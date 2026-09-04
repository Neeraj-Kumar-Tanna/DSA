class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
      List<List<Integer>> res = new ArrayList<>();
      rec(1 , new ArrayList<>() , res , n , k);

      return res;
    }

  private static void rec(int ind  , ArrayList<Integer> data , List<List<Integer>> res , int target , int k){
    if(ind > 9){
      if(data.size() == k && target == 0){
        res.add(new ArrayList<>(data));
      }
      return;
    } //edge case;
    if(data.size() == k ){
      if(target == 0){
        res.add(new ArrayList<>(data));
      }
      return;
    }

    data.add(ind);
    rec(ind+1 , data , res , target-ind , k);
    data.removeLast();
    rec(ind+1 , data , res , target , k);
  }

}