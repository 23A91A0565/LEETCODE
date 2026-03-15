class Solution {
public:
    long long countCommas(long long n) {
        long long res=0;
        if(n<=999)return res;
        if(n>=1000 ){
            long long count=min(n,999999LL)-1000+1;
            res=(res+count);
        }
        if(n>=1000000 ){
            long long count=min(n,999999999LL)-1000000+1;
            res=(res+(count*2));
        }
        if(n>=1000000000 ){
            long long count=min(n,999999999999LL)-1000000000+1;
            res=(res+(count*3));
        }
        if(n>=1000000000000 ){
            long long count=min(n,999999999999999LL)-1000000000000+1;
            res=(res+(count*4));
        }
        if(n>=1000000000000000){
            long long count=min(n,999999999999999999LL)-1000000000000000+1;
            res=(res+(count*5));
        }
        return res;
    }
};