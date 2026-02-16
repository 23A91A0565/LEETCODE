class Solution {
    public int reverseBits(int n) {
        // String res=Integer.toBinaryString(n);
        // while(res.length()<32){
        //     res="0"+res;
        // }
        // String sb=new StringBuilder(res).reverse().toString();
        // return Integer.parseInt(sb,2);

        int res=0;
        for(int i=0;i<32;i++){
            res<<=1;
            res|=(n&1);
            n>>=1;
        }
        return res;
    }
}