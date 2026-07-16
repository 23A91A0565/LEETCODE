class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int pre[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            pre[i]=gcd(max,nums[i]);
        }
        Arrays.sort(pre);
        long res=0;
        int i=0,j=n-1;
        while(i<j){
            res+=gcd(pre[i],pre[j]);
            i++;
            j--;
        }
        return res;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}