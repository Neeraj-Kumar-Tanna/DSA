class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        int ind = 0;
        int len = s1.length();
        List<List<String>> res = new ArrayList<>();

        while(ind < len){
            int temp = ind;
            while(temp < len && s1.charAt(temp) != s2.charAt(temp)){
                temp++;
            }

            if(ind != temp){
                List<String> dup = new ArrayList<>();
                dup.add(s1.substring(ind , temp));
                dup.add(s2.substring(ind , temp));
                res.add(dup);

                ind = temp;
            }
            else{
                ind++;
            }
        }

        return res ;
    }
}