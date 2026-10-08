class Solution {
    private static int ncr(int i , int j){
        if(j == 0 || j == i) return 1;
        int r = j;
        int nr= i-j;

        long temp = 1;
        for(int k = Math.max(r , nr)+1 ; k <= i ; k++){
            temp = temp*k;
        }
        for(int k = 2 ; k <= Math.min(r , nr) ; k++) temp /= k;
        // System.out.print(temp + " : ");
        // System.out.println(temp);

        return (int)temp;
    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();
        res.add(Arrays.asList(1));

        for(int i = 1 ; i < numRows ; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0 ; j <= i ; j++){
                temp.add(ncr(i , j));
            }
            res.add(temp);
        }

        return res;










        // List<List<Integer>> res = new ArrayList<>();

        // for(int i = 0 ; i < numRows ; i++){
        //     List<Integer> temp = new ArrayList<>();
        //     for(int j = 0 ; j <= i ; j++){
        //         if(j == 0 || j == i){
        //             temp.add(1);
        //             continue;
        //         }
        //         temp.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
        //     }
        //     res.add(temp);
        // }

        // return res;

    }
}