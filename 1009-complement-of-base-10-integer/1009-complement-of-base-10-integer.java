class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        int len=s.length();
        int total=(int)Math.pow(2,len)-1;
        return total-n;
    }
}