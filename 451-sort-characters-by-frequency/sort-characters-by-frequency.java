class Solution {
    public String frequencySort(String s) {
        // int freq[] = new int[62];
        HashMap<Character , Integer > mp = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            // if('0' >= ch && ch <= '9') freq[ch-'0']++;
            // else if('a' >= ch && ch <= 'z') freq[ch-'a'+10]++;
            // else freq[ch - 'A' + 10 + 26]++;
            mp.put(ch , mp.getOrDefault(ch , 0)+1);
        }
        StringBuilder sb = new StringBuilder();

        while(!mp.isEmpty()){
            char high = '@';
            int f = -1;
            for(Map.Entry<Character , Integer> entry : mp.entrySet()){
                if(entry.getValue() > f){
                    f = entry.getValue();
                    high = entry.getKey();
                }
            }
            for(int i = 0 ; i < f ; i++){
                sb.append(high);
            }
            mp.remove(high);
        }

        return new String(sb);
    }
}