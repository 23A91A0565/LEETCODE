class Solution {
    public long sumAndMultiply(int n) {
        int ans=0;
        int s=0;
        while(n>0){
            int r=n%10;
            if(r!=0){
                ans=ans*10+r;
                s+=r;
            }
            n/=10;
        }
        int rev=0;
        while(ans>0){
            int r=ans%10;
            rev=rev*10+r;
            ans/=10;
        }
        return (long)rev*s;
    }
}