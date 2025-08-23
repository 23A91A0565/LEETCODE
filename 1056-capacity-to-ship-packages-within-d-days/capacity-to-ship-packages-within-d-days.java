class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i:weights){
            sum+=i;
            max=Math.max(max,i);
        }
        int l=max;
        int h=sum;
        int ans=0;
        while(l<=h){
            int mid=(l+h)/2;
            if(isPossible(weights,days,mid)){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] a,int n,int m){
        int c=1;
        int s=0;
        for(int i:a){
            if(s+i>m){
                c++;
                s=0;
            }
            s+=i;
        }
        return c<=n;
    }
}