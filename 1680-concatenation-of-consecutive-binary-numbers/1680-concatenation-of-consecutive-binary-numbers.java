import java.math.BigInteger;
class Solution {
    public int concatenatedBinary(int n) {
        // StringBuilder sb=new StringBuilder();
        // for(int i=1;i<=n;i++){
        //     String s=Integer.toBinaryString(i);
        //     sb.append(s);
        // }
        // BigInteger val=new BigInteger(sb.toString(), 2);
        // BigInteger mod=BigInteger.valueOf(1_000_000_007);

        // return val.mod(mod).intValue();

        long res=0;
        int len=0;
        int mod=1_000_000_007;
        for(int i=1;i<=n;i++){
            if((i&(i-1))==0){
                len+=1;
            }
            res=((res<<len)+i)%mod;
        }
        return (int)res;
    }
}