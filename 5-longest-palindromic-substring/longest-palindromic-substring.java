class Solution {
    public String longestPalindrome(String s) {
        int max_len=1;
        String res=""+s.charAt(0);
        for(int i=0;i<s.length();i++){
            res=check(s,i,i,res);
            res=check(s,i,i+1,res);
        }
        return res;
    }
    public String check(String s,int i,int j,String m){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        String res=s.substring(i+1,j);
        if(j-i-1 >m.length()){
            return res;
        }
        else{
            return m;
        }

    }
}