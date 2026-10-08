class Solution {

    private static int ncr(int i ,  int j ){
        if(j == 0 || i == j) return 1;

        long res = 1;
        // int den = 1;
        for(int a = Math.max(j , i-j)+1 ; a <= i ; a++){
            // System.out.println((res*a) + " ; " + (i-a+1));
            res = (res*a)/(a-Math.max(j , i-j));
            // den++;
            // res = res*a;
        }
        // for(int a = 2 ; a <= Math.min(j , i-j); a++){
        //     res /= a;
        // }

        return (int)res;
    }

    private static int ncr2(int i , int j){
        if(j == 0 || j == i) return 1;
        int r = j;
        int nr= i-j;

        long temp = 1;
        for(int k = Math.max(r , nr)+1 ; k <= i ; k++){
            temp = temp*k;
        }
        for(int k = 2 ; k <= Math.min(r , nr) ; k++) temp /= k;
        System.out.print(temp + " : ");
        System.out.println(temp);

        return (int)temp;
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();

        for(int i = 0 ; i <= rowIndex ; i++){
            res.add(ncr(rowIndex , i));
        }

        return res;
    }
}