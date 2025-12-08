class Solution{
    public long totalScore(int hp,int[] damage,int[] requirement){
        int n=damage.length;
        long[] pre=new long[n+1];
        for(int i=0;i<n;i++){
            pre[i+1]=pre[i]+damage[i];
        }
        long res=0;
        for(int i=0;i<n;i++){
            res+=solve(requirement,pre,i,hp);
        }
        return res;
    }
    public int solve(int[] req,long[] pre,int end,int hp){
        long Ti=pre[end+1]-(hp-req[end]);
        if(Ti<=pre[0])return end+1;
        if(Ti>pre[end])return 0;
        int st=0,en=end;
        while(st<en){
            int mid=st+(en-st)/2;
            if(pre[mid]>=Ti)en=mid;
            else st=mid+1;
        }
        return end+1-st;
    }
}
