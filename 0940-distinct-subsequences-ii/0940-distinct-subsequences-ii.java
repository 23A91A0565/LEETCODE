class Solution {
    public int distinctSubseqII(String s) {
        long mod=1000000007;
        long last[]=new long[26];
        long total=0;
        for(int i=0;i<s.length();i++){
            int ind=s.charAt(i)-'a';
            long newSub=(total+1)%mod;
            total=(total+newSub-last[ind]+mod)%mod;
            last[ind]=newSub;
        }
        return (int)total;
    }
}