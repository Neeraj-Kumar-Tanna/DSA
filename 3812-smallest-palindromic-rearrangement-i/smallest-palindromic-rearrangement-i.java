class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int[] li = new int[s.length()/2];

        for(int i = 0 ; i < s.length()/2 ; i++){
            li[i] = s.charAt(i);
        }

        Arrays.sort(li);

        for(int curr : li){
            sb.append((char)curr);
        }

        if(s.length()%2 == 1){
            sb.append(s.charAt(s.length()/2));
        }

        for(int i = li.length-1 ; i >= 0 ; i--){
            sb.append((char)li[i]);
        }

        return new String(sb);
    }
}