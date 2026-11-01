class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length()-1;
        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }

        int len_lastWord = 0;
        while(i >= 0 && s.charAt(i) != ' '){
            len_lastWord++;
            i--;
        }

        return len_lastWord;
    }
}