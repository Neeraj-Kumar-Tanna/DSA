class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
      List<List<Integer>> res = new ArrayList<>();
      
      rec(0 , new ArrayList<>() , nums , res);

      List<List<Integer>> uni = new ArrayList<>(new LinkedHashSet<>(res));

      return uni;

    }

    private static void rec(int ind , List<Integer> data , int[] arr , List<List<Integer>> res){
      if(ind == arr.length){
        List<Integer> temp = new ArrayList<>(data);
        Collections.sort(temp);
        res.add(temp);
        return;
      }
      data.add(arr[ind]);
      rec(ind+1 , data , arr , res);
      data.removeLast();
      rec(ind+1 , data , arr , res);
    }
}