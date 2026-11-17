class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {


      int low = newInterval[0] , high = newInterval[1];
      int l = 0 , h = intervals.length-1;
      while(l <= h){
        int mid = (l+h)/2;
        if(intervals[mid][1] >= low){
          h = mid-1;
        }
        else{
          l = mid+1;
        }
      }

      int min_inter = l;
      l = 0 ;
      h = intervals.length-1;
      while(l <= h){
        int mid = (l + h)/2;
        if(intervals[mid][0] <= high){
          l = mid+1;
        }
        else{
          h = mid-1;
        }
      }

      int max_inter = h;
      // System.out.println("min : " + min_inter + " max : " + max_inter);

      List<List<Integer>> res = new ArrayList<>();
      
      // if(min_inter > max_inter && max_inter == -1){
      //   res.add(List.of(low , high));
      // }
      for(int i = 0 ; i < min_inter ; i++){
        res.add(List.of(intervals[i][0] , intervals[i][1]));
      }
      if(min_inter <= max_inter){
        res.add(List.of(Math.min(low , intervals[min_inter][0]) , Math.max(high , intervals[max_inter][1])));
      }
      
      for(int i = max_inter+1 ; i < intervals.length ; i++){
        res.add(List.of(intervals[i][0] , intervals[i][1]));
      }
      // if(min_inter > max_inter && min_inter == intervals.length){
      //   res.add(List.of(low , high));
      // }
      if(min_inter > max_inter){
        if(max_inter == -1){
          List<Integer> temp = List.of(low , high);
          res.add(0 , temp);
        }
        else if(min_inter == intervals.length){
          res.add(List.of(low , high));
        }
        else{
          List<Integer> temp = List.of(low , high);
          res.add(min_inter , temp);
          // res.insert(min_inter , List.of(low , high));
        }
      }

      int[][] final_res = new int[res.size()][2];
      for(int i = 0 ; i < res.size() ; i++){
        // System.out.println(res.get(i).get(0) + " : " + res.get(i).get(1));
        final_res[i][0] = res.get(i).get(0);
        final_res[i][1] = res.get(i).get(1);
      }

      return final_res;








      //approach -2-----------------------

      // int len = intervals.length;
      // if(len == 0){
      //   return new int[][]{{newInterval[0] , newInterval[1]}};
      // }
      // // if(intervals[0][0] >= newInterval[0] && intervals[len-1][1] <= newInterval[1]){
      // //   return new int[][]{{newInterval[0] , newInterval[1]}};
      // // }

      // int low = newInterval[0];
      // int high = newInterval[1];
      
      // boolean notfound = true;

      
      // List<List<Integer>> res = new ArrayList<>();

      // if(newInterval[1] < intervals[0][0]){
      //   List<Integer> temp = new ArrayList<>();
      //   temp.add(newInterval[0]);
      //   temp.add(newInterval[1]);
      //   res.add(temp);
      // }

      // for(int i = 0 ; i < len ; i++){
      //   if(notfound && ((newInterval[0] <= intervals[i][0] && newInterval[1] >= intervals[i][1]) || (intervals[i][0] <= newInterval[0] && newInterval[0] <= intervals[i][1]) || (intervals[i][0] <= newInterval[1] && newInterval[1] <= intervals[i][1]))){
      //     low = Math.min(intervals[i][0] , newInterval[0]);
      //     high = Math.max(intervals[i][1] , newInterval[1]);
      //     i++;
      //     while(i < len && intervals[i][0] <= high){
      //       high = Math.max(intervals[i][1], high);
      //       i++;
      //     }
      //     i--;
      //     List<Integer> temp = new ArrayList<>();
      //     temp.add(low);
      //     temp.add(high);
      //     res.add(temp);
      //     notfound = false;
      //   }
      //   else{
      //     List<Integer> temp = new ArrayList<>();
      //     temp.add(intervals[i][0]);
      //     temp.add(intervals[i][1]);
      //     res.add(temp);
      //   }
      // }

      // if(newInterval[0] > intervals[len-1][1]){
      //   List<Integer> temp = new ArrayList<>();
      //   temp.add(newInterval[0]);
      //   temp.add(newInterval[1]);
      //   res.add(temp);
      // }

      // int[][] sol = new int[res.size()][2];
      // for(int i = 0 ; i < res.size() ; i++){
      //   // System.out.println(res.get(i).get(0) + " : " + res.get(i).get(1));
      //   sol[i][0] = res.get(i).get(0);
      //   sol[i][1] = res.get(i).get(1);
      // }

      // return sol;





      //Approach -1 -------------------------







      // System.out.println(low + " : " + high);
      // int cur = 0;
      // while(cur < len && )

      // return intervals;


      // List<List<Integer>> res = new ArrayList<>();
      // boolean notfound = true;
      // for(int i = 0 ; i < intervals.length ; i++){
      //   if(notfound && ((newInterval[0] >= intervals[i][0] && newInterval[0] <= intervals[i][1]) || (intervals[i][0] <= newInterval[1] && intervals[i][1] <= newInterval[1]))){
      //     int low = Math.min(intervals[i][0] , newInterval[0]);
      //     int high = Math.max(newInterval[1] , intervals[i][1]);
      //     i++;
      //     while(i<intervals.length && high > intervals[i][0]){
      //       high = Math.max(intervals[i][1] , high);
      //       i++;
      //     }
      //     List<Integer> temp = new ArrayList<>();
      //     temp.add(low);
      //     temp.add(high);
      //     res.add(temp);
      //     notfound = false;
      //   }
        // else{
        //   List<Integer> temp = new ArrayList<>();
        //   temp.add(intervals[i][0]);
        //   temp.add(intervals[i][1]);
        //   res.add(temp);
        // }
      // }
      
    }
}