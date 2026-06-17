class Solution {
    public char processStr(String s, long k) {
        long len=0;
        for(char c:s.toCharArray()){
            if(c=='*'){
                len=Math.max(0,len-1);
            }
            else if(c=='#'){
                len*=2;
            }
            else if(c=='%'){
                continue;
            }
            else{
                len++;
            }
        }

        if(k>=len){
            return '.';
        }

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='*'){
                len++;
            }
            else if(s.charAt(i)=='#'){
                long ha=len/2;
                len=len/2;
                if(k>=ha)k-=ha;
            }
            else if(s.charAt(i)=='%'){
                k=len-1-k;
            }
            else{
                if(k==len-1)return s.charAt(i);
                else len--;
            }
        }
        return '.';


        // StringBuilder result = new StringBuilder();
        // for (char ch : s.toCharArray()) {
        //     if (Character.isLowerCase(ch)) {
        //         result.append(ch);
        //     } else if (ch == '*') {
        //         if (result.length() > 0) {
        //             result.deleteCharAt(result.length() - 1);
        //         }
        //     } else if (ch == '#') {
        //         result.append(result.toString());
        //     } else if (ch == '%') {
        //         result.reverse();
        //     }
        // }
        // if(k>=result.length()){
        //     return '.';
        // }
        // return result.charAt((int)k);
    }
}