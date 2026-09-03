class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> res = new ArrayList<>();
      List<Integer> data = new ArrayList<>();
      rec(0 , 0 , data , candidates , res , target);
      return res;
    }

    private static void rec( int ind ,int sum , List<Integer> data , int[] arr , List<List<Integer>> res , int target){
      System.out.println(ind + " : " + data + " : " + sum);
      if(sum > target){
        return;
      }
      if(ind == arr.length){
        if(sum == target){
          System.out.println("sum in 1 : "+sum + " : "+ data);
          List<Integer> temp = new ArrayList<>();
          for(int cur : data){
            temp.add(cur);
          }
          res.add(temp);
        }
        return;
      }
      if(sum == target){
        System.out.println("sum in 2 : "+sum +" : " + data);
        List<Integer> temp = new ArrayList<>();
        for(int cur : data){
          temp.add(cur);
        }
        res.add(temp);
        return;
      }

      data.add(arr[ind]);
      rec(ind , sum+arr[ind] , data , arr , res , target);
      
      // rec(ind+1 , sum+arr[ind] , data , arr , res , target);
      data.removeLast();
      rec(ind+1 , sum , data , arr , res , target);
    }
}