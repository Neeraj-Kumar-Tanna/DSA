class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        int push = 0;
        int mul = 1;
        for(int i = 1 ; i <= len; i++){
            push += mul;
            if(i%8 == 0){
                mul++;
            }
        }

        return push;
    }
}