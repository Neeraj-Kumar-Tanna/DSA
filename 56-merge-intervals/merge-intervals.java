class Solution {
    public int[][] merge(int[][] intervals) {

      Arrays.sort(intervals , (a , b)-> Integer.compare(a[0] , b[0]));

      List<List<Integer>> res = new ArrayList<>();
      
      for(int i = 0 ; i < intervals.length ; i++){
        int low = intervals[i][0];
        int high = intervals[i][1];
        while(i+1 < intervals.length && high >= intervals[i+1][0]){
          high = Math.max(intervals[i+1][1] , high);
          i++;
        }
        res.add(List.of(low , high));
      }

      int fin_res[][] = new int[res.size()][2];
      for(int i = 0 ; i < res.size() ; i++){
        // System.out.println(res.get(i).get(0) + " : " + res.get(i).get(1));
        fin_res[i][0] = res.get(i).get(0);
        fin_res[i][1] = res.get(i).get(1);
      }

      return fin_res;





      //----------------- Approach - 1----------------

        // for(int i = 0 ; i < intervals.length ;i++){

        //     int min = i;

        //     for(int j = i + 1; j < intervals.length ; j++){
        //         min = intervals[min][0] < intervals[j][0] ? min : j;
        //     }

        //     int temp1 = intervals[i][0];
        //     int temp2 = intervals[i][1];
        //     intervals[i][0] = intervals[min][0];
        //     intervals[i][1] = intervals[min][1];
        //     intervals[min][0] = temp1;
        //     intervals[min][1] = temp2;

        // }

        // Arrays.sort(intervals , (a, b) ->  Integer.compare(a[0] , b[0]));

        // // HashSet<Integer> s = new HashSet<>();
        // int[] checked = new int[intervals.length];
        // List<int[]> res = new ArrayList<>();

        // int low = intervals[0][0];
        // int high = intervals[0][1];

        // for(int i = 1 ; i < intervals.length; i++){
        //     if(intervals[i][0] <= high){
        //         high = Math.max(high , intervals[i][1]);
        //     }
        //     else{
        //         res.add(new int[]{low , high});
        //         low = intervals[i][0];
        //         high = intervals[i][1];
        //     }
        // }

        // res.add(new int[]{low , high});

        // for(int i = 0 ; i < intervals.length; i++){
        //     if(checked[i] == 1) continue;
        //     checked[i] = 1;

        //     int low = intervals[i][0];
        //     int high = intervals[i][1];
        //     for(int j = i+1 ; j < intervals.length ; j++){
        //         if(checked[j] == 1) continue;

        //         if(intervals[j][0] >= low && intervals[j][0] <= high){
        //             high = Math.max(intervals[j][1] , high);
        //             checked[j] = 1;
        //         }
        //         else if(intervals[j][1] >= low && intervals[j][1] <= high){
        //             low = intervals[j][0];
        //             checked[j] = 1;
        //         }
        //         else if(low >= intervals[j][0] && high <= intervals[j][1]){
        //             low = intervals[j][0];
        //             high = intervals[j][1];
        //             checked[j] = 1;
        //         }
        //         else if(low <= intervals[j][0] && high >= intervals[j][1]){
        //             checked[j] = 1;
        //         }

        //     }

        //     res.add(new int[]{low , high});
        // }

        // int[][] ans = new int[res.size()][2];
        // for(int i = 0 ; i < res.size(); i++){
        //     ans[i][0] = res.get(i).get(0);
        //     ans[i][1] = res.get(i).get(1);
        // }

        // int[][] ans = res.toArray(new int[res.size()][]);

        // return ans;
    }
}