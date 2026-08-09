class Solution {
    public int beautySum(String s) {
        
        int len = s.length();
        // int max = -1 , min = 505;
        int res = 0;

        for(int i = 0; i < len ; i++){
            HashMap<Character , Integer> mp = new HashMap<>();
            for(int j = i ; j < len ; j++){
                mp.put(s.charAt(j) , mp.getOrDefault(s.charAt(j) , 0) + 1);
                int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
                for(Map.Entry<Character , Integer> e : mp.entrySet()){
                    max = max < e.getValue() ? e.getValue() : max;
                    min = min > e.getValue() ? e.getValue() : min;
                }

                res += (max-min);
            }


            // freq[s.charAt(i)]++;
            // max = max < freq[s.charAt(i)] ? freq[s.charAt(i)] : max;
            // min = min > freq[s.charAt(i)] ? freq[s.charAt(i)] : min;
        }

        return res;

    }
}