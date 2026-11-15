class Solution {
  public int eraseOverlapIntervals(int[][] intervals) {
    int len = intervals.length;

    Arrays.sort(intervals , (a , b)-> Integer.compare(a[1] , b[1]));
    int cnt = 0;
    int free = intervals[0][1];
    for(int i = 1 ; i < len ; i++){
      if(intervals[i][0]<free){
        cnt++;
      }
      else{
        free = intervals[i][1];
      }
    }

    return cnt;
  }
}