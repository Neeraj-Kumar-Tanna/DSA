class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        int[] freq = new int[26];
        for(int i = 0 ; i < len/2 ; i++){
            freq[s.charAt(i)-'a']++;
        }

        for(int i = 0; i < 26 ; i++){
            for(int j = 0 ; j < freq[i] ; j++){
                sb.append((char)(i+'a'));
            }
        }
        if(len%2 == 1){
            sb.append(s.charAt(len/2));
        }
        for(int i = 25; i >= 0 ; i--){
            for(int j = 0 ; j < freq[i] ; j++){
                sb.append((char)(i+'a'));
            }
        }

        return new String(sb);
    }
}