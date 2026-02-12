class Solution {
    public int longestBalanced(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            int freq[]=new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                if(isSame(freq)){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
    public boolean isSame(int freq[]){
        int value=0;
        for(int a:freq){
            if(value==0){
                value=a;
            }
            else if(a!=0 && value!=a)return false;
        }
        return true;
    }
}