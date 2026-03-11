class Solution {
    public int bitwiseComplement(int n) {
        // String s=Integer.toBinaryString(n);
        // int len=s.length();
        if(n==0)return 1;
        int a=n;
        int len=0;
        while(a!=0){
            len++;
            a=a>>1;
        }
        int total=(int)Math.pow(2,len)-1;
        return total-n;
    }
}