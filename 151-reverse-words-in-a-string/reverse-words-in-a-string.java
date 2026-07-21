class Solution {
    public String reverseWords(String s) {
        int r = s.length() -1 , l = s.length()-1;

        StringBuilder sb = new StringBuilder();
        while(l >= 0 && s.charAt(r) == ' '){
            l--;
            r--;
        }

        while(l >= 0){
            if(s.charAt(l) == ' '){
                sb.append(s.substring(l+1 , r+1) + " ");
                r = l;

                while(l >= 0 && s.charAt(r) == ' '){
                    l--;
                    r--;
                }
                l++;
            }
            else if(l == 0){
                sb.append(s.substring(l , r+1) + " ");
            }
            l--;
        }
        sb.delete(sb.length()-1 , sb.length());

        return new String(sb);
    }
}