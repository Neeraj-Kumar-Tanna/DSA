class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)) return true;

        char[] arr = s.toCharArray();
        for(int i = 1 ; i < s.length() ; i++){
            rotate2(arr);
            String st = new String(arr);
            System.out.println(st);
            if(st.equals(goal)) return true;
        }

        return false;
    }

    void rotate2(char[] arr){
        int len = arr.length;
        for(int i = 0 ; i < len/2 ; i++){
            char temp = arr[i];
            arr[i] = arr[len-1-i];
            arr[len-1-i] = temp;
        }

        for(int i = 0 ; i < (len-1)/2 ; i++){
            char temp = arr[i];
            arr[i] = arr[len-2-i];
            arr[len-2-i] = temp;
        }
    }

    void rotate(char[] arr){
        char temp = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            char temp1 = arr[i];
            arr[i] = temp;
            temp = temp1;
        }
        arr[0] = temp;
    }
}