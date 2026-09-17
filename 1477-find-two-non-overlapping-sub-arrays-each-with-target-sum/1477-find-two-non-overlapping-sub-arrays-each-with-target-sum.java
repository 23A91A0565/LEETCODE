class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int res=Integer.MAX_VALUE;
        int best=Integer.MAX_VALUE;
        int n=arr.length;
        int bestEndingAt[]=new int[n];
        int sum=0;
        int left=0,right=0;
        while(right<n){
            sum+=arr[right];
            while(sum>target){
                sum-=arr[left];
                left++;
            }
            if(sum==target){
                int len=right-left+1;
                if(left>0 && bestEndingAt[left-1]!=0){
                    res=Math.min(res,len+bestEndingAt[left-1]);
                }
                if(best==Integer.MAX_VALUE){
                    best=len;
                }
                else{
                    best=Math.min(best,len);
                }
            }
            if(best==Integer.MAX_VALUE){
                bestEndingAt[right]=0;
            }
            else{
                bestEndingAt[right]=best;
            }
            right++;
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}