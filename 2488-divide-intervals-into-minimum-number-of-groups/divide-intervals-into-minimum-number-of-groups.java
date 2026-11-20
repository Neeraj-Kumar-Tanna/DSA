class Solution {
  public int minGroups(int[][] intervals) {

    int len = intervals.length;

    Arrays.sort(intervals, (a, b)->Integer.compare(a[0],b[0]));
    // Arrays.sort(intervals , (a , b)->{
    //   if(a[1] > b[1]){
    //     System.out.println("hii");
    //     int temp = b[1];
    //     b[1] = a[1];
    //     a[1] = temp;
    //   }
    //   return 0;
    // });
    int[] dep = new int[len];
    for(int i = 0 ; i < len ; i++){
      dep[i] = intervals[i][1];
    }

    Arrays.sort(dep);

    int a = 0 , d = 0;
    int cnt = 0;
    int res = 0;
    while(a < len){
      if(intervals[a][0] <= dep[d]){
        cnt++;
        a++;
      }
      else{
        cnt--;
        d++;
      }
      res = Math.max(cnt , res);
    }


    // for(int i = 0 ; i < len ; i++){
    //   System.out.println(intervals[i][0]
    //    + " "+ dep[i]);
    // }

    return res;

    






    // --Approach-2----------------O(nlogn + n*n)---
    // int len = intervals.length;
    // Arrays.sort(intervals , (a , b)->Integer.compare(a[0] , b[0]));

    // List<Integer> highs = new ArrayList<>();
    // for(int i = 0 ; i < len ; i++){
    //   int high = intervals[i][0];
    //   boolean checked = false;
    //   int l = 0 , h = highs.size();
    //   while(l <= h){
    //     int mid = (l+h)/2;
    //     if(highs.get(mid) >= high){
    //       h = mid-1;
    //     }
    //     else{
    //       l = mid+1;
    //       checked = true;
    //     }
    //   }
    //   if(checked){
    //     highs.set(h , intervals[i][1]);
    //   }
    //   else{
    //     highs.add(intervals[i][1]);
    //   }
    //   // for(int j = 0 ; j < highs.size() ; j++){
    //   //   if(high > highs.get(j)){
    //   //     highs.set(j , intervals[i][1]);
    //   //     checked = true;
    //   //     break;
    //   //   }
    //   // }
    //   if(!checked){
    //     highs.add(intervals[i][1]);
    //   }
    // }

    // return highs.size();






    //Approach-1----O(nlogn + n + n2)

    // int len = intervals.length;
    // Arrays.sort(intervals , (a , b)->Integer.compare(a[0] , b[0]));
    
    // List<List<Integer>> inter = new ArrayList<>();
    // for(int i = 0 ; i < len ; i++){
    //   inter.add(List.of(intervals[i][0] , intervals[i][1]));
    // }

    // boolean[] done = new boolean[len];
    // int groups = 0;
    // while(inter.size() > 0){
    //   int low = inter.get(0).get(0);
    //   int high = inter.get(0).get(1);
    //   // System.out.println("out : "+low + " : " + high);
    //   inter.remove(0);
    //   // for(int i = 0 ; i < inter.size() ; i++)
    //   int i = 0;
    //   while(i < inter.size()){

    //     if(inter.get(i).get(0) > high){
    //       // System.out.println("in : "+ i + " : " + inter.get(i).get(0) );
    //       high = inter.get(i).get(1);
    //       inter.remove(i);
    //     }
    //     else{
    //       // System.out.println("in : " + i );
    //       i++;
    //     }
    //   }
    //   // System.out.println("grps : "+ groups);
    //   groups++;
    // }

    // return groups;
  }
}