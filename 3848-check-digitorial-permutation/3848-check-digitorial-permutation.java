class Solution {
    public boolean isDigitorialPermutation(int n) {
        int digPer[]=new int[]{1,2,145,40585};
        
        int freq_n[]=getFreq(n);
        for(int ele:digPer){
            int freq_ele[]=getFreq(ele);
            if(ele==n)return true;
            if(count_dig(n)!=count_dig(ele))continue;
            if(isSame(freq_n,freq_ele)){
                return true;
            }
        }
        return false;
    }
    int[] getFreq(int n){
        int f[]=new int[10];
        while(n!=0){
            f[n%10]++;
            n=n/10;
        }
        return f;
    }
    int count_dig(int n){
        if(n==0)return 1;
        int res=0;
        while(n!=0){
            n=n/10;
            res+=1;
        }
        return res;
    }
    boolean isSame(int f1[],int f2[]){
        for(int i=0;i<=9;i++){
            if(f1[i]!=f2[i])return false;
        }
        return true;
    }
}