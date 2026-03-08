class Solution {
    public long minCost(String s, int encCost, int flatCost) {
        long res=0;
        int n=s.length();
        int pre[]=new int[n];
        pre[0]=s.charAt(0)-'0';
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+(s.charAt(i)-'0');
        }

        return cal(0,n-1,pre,s,encCost,flatCost);
    }
    public static long cal(int l,int h,int pre[],String s,int ca,int cb){
        int gap=h-l+1;
        long res=0;
        long ones=pre[h]-(l>0?pre[l-1]:0);
        
        if(ones==0)
            res+=cb;
        else 
            res+=(long)gap*ones*ca;
        
        if(gap%2==0){
            int mid=(l+h)/2;;
            res=Math.min(res,cal(l,mid,pre,s,ca,cb)+cal(mid+1,h,pre,s,ca,cb));
        }
        return res;
    }
}