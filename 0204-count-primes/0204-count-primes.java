class Solution {
    public int countPrimes(int n) {
        boolean isPrime[]=new boolean[n];
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(!isPrime[i]){
                for(int j=i*i;j<n;j+=i){
                    isPrime[j]=true;
                }
            }
        }
        int res=0;
        for(int i=2;i<n;i++){
            if(!isPrime[i]){
                res++;
            }
        }
        return res;
    }
}