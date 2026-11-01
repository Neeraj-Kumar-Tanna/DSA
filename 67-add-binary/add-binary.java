class Solution {
    public String addBinary(String a, String b) {
        int len_a = a.length();
        int len_b = b.length();
        
        String s = "";
        int i = len_a-1;
        int j = len_b-1;

        int carry = 0;

        while( i>=0 && j >= 0){
            int temp = (a.charAt(i)-'0') + (b.charAt(j)-'0') + carry;
            
            if(temp == 3){
                s = "1" + s;
                carry = 1;
            }
            else if(temp == 2){
                s = "0" + s;
                carry = 1; 
            }
            else if(temp == 1){
                s = "1" + s;
                carry = 0;
            }
            else{
                carry = 0;
                s = "0" + s;
            }

            i--;
            j--;
        }

        // boolean is_a = i>=0?true : false;

        // if(i >= 0){
        //     while( i >= 0 ){
        //         int temp = a.charAt(i)-'0' + carry;

        //     }
        // }

        while( i >= 0 ){
            int temp = a.charAt(i)-'0' + carry;
            if(temp == 2){
                s ="0" + s ;
                carry = 1;
            }
            else if(temp == 1){
                s = "1" + s;
                carry = 0;
            }
            else{
                s ="0" + s;
                carry = 0;
            }

            i--;
        }

        while( j >= 0 ){
            int temp = b.charAt(j)-'0' + carry;
            if(temp == 2){
                s = "0" + s;
                carry = 1;
            }
            else if(temp == 1){
                s = "1" + s;
                carry = 0;
            }
            else{
                s = "0"+s;
                carry = 0;
            }

            j--;
        }

        if(carry == 1){
            s = "1" + s;
        }
        // System.out.println(s);
        // s = s.reverse();
        return s;

    }
}