class Solution {
    public String rearrangeString(String s, char x, char y) {
        int len = s.length();
        int p1 = 0 , p2 = len-1;
        char[] ch = s.toCharArray();
        while(p1 < p2){
            if(ch[p1] == x && ch[p2] == y){
                char temp = ch[p1];
                ch[p1] = ch[p2];
                ch[p2] = temp;
                p1++;
                p2--;
            }
            else if(ch[p1] == x){
                p2--;
            }
            else if(ch[p2] == y){
                p1++;
            }
            else{
                p1++;
            }
        }

        return new String(ch);
        
    }
}