class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        s = s+s;
        int len = goal.length();

        for(int i = 0 ; i < len; i++){
            // System.out.println(s.substring(i , i+len));
            if(s.substring(i , i+len).equals(goal)) return true;
        }

        return false;
    }
}