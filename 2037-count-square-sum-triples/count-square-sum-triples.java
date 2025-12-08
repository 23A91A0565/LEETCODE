class Solution {
    public int countTriples(int n) {
        int cnt=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int a=i*i;
                int b=j*j;
                int c=(int)Math.sqrt(a+b);
                if(c<=n && c*c==a+b){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}