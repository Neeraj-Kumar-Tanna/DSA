class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        int min = Integer.MAX_VALUE;
        // for(int i = 0 ; i < len ; i++){
        //     min = strs[i].length() < min ? strs[i].length() : min;
        // }

        
        for(int i = 0 ; i < strs[0].length() ; i++){
            char tar = strs[0].charAt(i);

            for(int j = 0 ; j < len ;j++){
                if(i == strs[j].length() || tar != strs[j].charAt(i)){  
                         
                    return strs[0].substring(0 , i);
                }
            }
        }

        // if(!ret && min > 0) return strs[0].substring(0, min);
        return strs[0];

        // int len = strs.length();
        // String res = "";
        // for(int i = 1 ; i <= len/2 ; i++){
        //     String tar = strs.substring(0,i);
        //     boolean ok = true;
        //     for(int j = 0 ; j+i < len ; j += i){
        //         if(tar != strs.substring(j , j+i)){
        //             ok = false;
        //             break;
        //         }
        //     }

        //     if(ok){
        //         res = tar;
        //     }
        // }

        // return res;
    }
}