class Solution {
    public int numberOfSubstrings(String s) {
        int res=0;
        int count[]=new int[3];
        int l=0,r=0;
        for(r=0;r<s.length();r++){
            count[s.charAt(r)-'a']++;
            while(count[0]>0 && count[1]>0 && count[2]>0){
                res+=s.length()-r;
                count[s.charAt(l)-'a']--;
                l++;
            }
        }
        return res;
    }
}