class Solution {
    public long countCommas(long n) {
        if(n <= 999) return 0;

        if(n <= 999999L){
            // System.out.println("1");
            return n-999;
        }
        else if(n > 999999L && n <= 999999999L){
            // System.out.println("2");
            return (n - 999_999L)*2 + (999_999-999L)*1;
        }
        else if(n > 999_999_999L && n <= 999_999_999_999L){
            // System.out.println("3");
            return (n - 999_999_999L)*3 + (999_999_999L - 999_999L)*2 + (999_999L - 999L)*1;
        }
        else if(n > 999_999_999_999L && n <= 999_999_999_999_999L){
            // System.out.println("4");
            return (n - 999_999_999_999L)*4 + (999_999_999_999L - 999_999_999L)*3 + (999_999_999L - 999_999L)*2 + (999_999L - 999L)*1;
        }
        else if(n > 999_999_999_999_999L){
            // System.out.println("5");
            return (n - 999_999_999_999_999L)*5 + (999_999_999_999_999L - 999_999_999_999L)*4 + (999_999_999_999L - 999_999_999L)*3 + (999_999_999L - 999_999L)*2 + (999_999L - 999L)*1;
        }

        // System.out.println("6");
        return (long)0;

        // if(n > 999999999999999){
        //     res += (n-999999999999999)*5;
        // }

        // if(n > 999999999999){
        //     res += 
        // }
        

        // ------------------Approach#1------------------------------


        
        // long temp = n;
        // int len = 0;
        // while(temp > 0){
        //     len++;
        //     temp = temp/10;
        // }

        // long  res = 0;

        // len = len - 4;
        // long prev = 9000;
        // long res = 0;
        // int mul = 1;
        // int cnt =0;
        // while(len > 0){
        //     if(cnt == 3){
        //         cnt=0;
        //         mul++;
        //     }

        //     res = res*10 + prev*mul;

        //     cnt++;
        //     len--;
        // }

        // return res;
    }
}