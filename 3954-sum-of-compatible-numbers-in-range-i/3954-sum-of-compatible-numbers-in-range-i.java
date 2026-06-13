class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int res=0;
        int st=Math.max(1,n-k);
        for(int i=st;i<=n+k;i++){
            if((n&i)==0){
                res+=i;
            }
        }
        return res;
    }
}