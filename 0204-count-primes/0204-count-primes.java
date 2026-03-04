class Solution {
    public int countPrimes(int n) {
        if(n<=2)return 0;
        boolean s[]=new boolean[n];
        for(int i=2;i<n;i++){
            s[i]=true;
        }
        for(int i=2;i*i<n;i++){
            if(s[i]){
                for(int j=2*i;j<n;j+=i){
                    s[j]=false;
                }
            }
        }

        int c=0;
        for(int i=2;i<n;i++){
            if(s[i])c+=1;
        }
        return c;
    }
}