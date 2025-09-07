class Solution {
    public int[] sumZero(int n) {
        int j=0;
        int ans[]=new int[n];
        for(int i=1;i<=n/2;i++){
            ans[j++]=i;
            ans[j++]=-i;
        }
        if(n%2!=0){
            ans[j]=0;
        }
        return ans;
    }
}