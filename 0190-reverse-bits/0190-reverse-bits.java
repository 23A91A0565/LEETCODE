class Solution {
    public int reverseBits(int n) {
        String res=Integer.toBinaryString(n);
        while(res.length()<32){
            res="0"+res;
        }

        String sb=new StringBuilder(res).reverse().toString();
        return Integer.parseInt(sb,2);
    }
}