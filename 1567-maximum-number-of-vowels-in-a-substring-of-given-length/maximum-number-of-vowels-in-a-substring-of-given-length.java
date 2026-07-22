class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        int curr = 0;
        for(int i = 0 ; i < k ; i++){
            if(isv(s.charAt(i))){
                curr++;
                max = Math.max(curr , max);
            }
        }

        for(int i = k ; i< s.length(); i++){
            if(isv(s.charAt(i-k))){
                curr--;
            }

            if(isv(s.charAt(i))) curr++;
            max = Math.max(curr , max);
        }

        return max;

    }

    boolean isv(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
}