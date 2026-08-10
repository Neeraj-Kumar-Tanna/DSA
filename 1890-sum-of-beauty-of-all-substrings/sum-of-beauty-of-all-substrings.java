class Solution {
    public int beautySum(String s) {
        int len = s.length();
        int res = 0;

        for(int i = 0 ; i < len ;i++){
            HashMap<Character , Integer> freq = new HashMap<>();
            for(int j = i ; j < len ; j++){
                char temp = s.charAt(j);
                freq.put(s.charAt(j) , freq.getOrDefault(s.charAt(j) , 0 )+1);
                int max = Integer.MIN_VALUE , min = Integer.MAX_VALUE;

                for(Map.Entry<Character , Integer> x : freq.entrySet()){
                    max = max < x.getValue() ? x.getValue() : max;
                    min = min > x.getValue() ? x.getValue() : min;
                }

                res += (max - min);
            }
        }

        return res;
    }
}