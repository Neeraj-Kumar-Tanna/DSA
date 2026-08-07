class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < len ; i++){
            min = strs[i].length() < min ? strs[i].length() : min;
        }

        boolean ret = false;
        for(int i = 0 ; i < min ; i++){
            char tar = strs[0].charAt(i);

            for(int j = 0 ; j < len ;j++){
                if(tar != strs[j].charAt(i)){  
                    ret = true;         
                    return strs[0].substring(0 , i);
                }
            }
        }

        if(!ret && min > 0) return strs[0].substring(0, min);
        return "";

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