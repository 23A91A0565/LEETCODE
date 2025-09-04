class Solution {
    public int sumSubarrayMins(int[] arr) {
       int m=(int)(1e9+7);
        int nse[]=nse(arr);
        int pse[]=pse(arr);
        long ans=0;
        for(int i=0;i<arr.length;i++){
            int left=nse[i]-i;
            int right=i-pse[i];
            long temp=(1L*left*right)%m;
            ans=(ans+((temp)%m*(arr[i])%m)%m)%m;

        }
        return (int)ans;
    }
    private int[]nse(int a[]){
        Stack<Integer>s=new Stack<>();
        int ans[]=new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty()&&a[s.peek()]>=a[i]){
                s.pop();
            }
            ans[i]=s.isEmpty()?a.length:s.peek();
            s.push(i);
        }
        return ans;
    }
    private int[]pse(int a[]){
        Stack<Integer>s=new Stack<>();
        int ans[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            while(!s.isEmpty()&&a[s.peek()]>a[i]){
                s.pop();
            }
            ans[i]=s.isEmpty()?-1:s.peek();
            s.push(i);
        }
        return ans; 
    }
}