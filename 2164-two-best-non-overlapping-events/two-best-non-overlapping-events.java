class Solution{
    public int maxTwoEvents(int[][] events){
        Arrays.sort(events,(a,b)->Integer.compare(a[0],b[0]));
        int n=events.length;
        int[]suffixMax=new int[n];
        suffixMax[n-1]=events[n-1][2];
        for(int i=n-2;i>=0;i--){
            suffixMax[i]=Math.max(suffixMax[i+1],events[i][2]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int currEnd=events[i][1];
            int currVal=events[i][2];
            int next=upperBound(events,i+1,n,currEnd);
            if(next<n){
                ans=Math.max(ans,currVal+suffixMax[next]);
            }else{
                ans=Math.max(ans,currVal);
            }
        }
        return ans;
        }
    public int upperBound(int[][] events,int l,int n,int ele){
        int h=n;
        while(l<h){
            int mid=l+(h-l)/2;
            if(events[mid][0]<=ele){
                l=mid+1;
            }else{
                h=mid;
            }
        }
        return l;
    }
}
