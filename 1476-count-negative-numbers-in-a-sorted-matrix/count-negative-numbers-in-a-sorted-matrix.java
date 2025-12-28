class Solution {
    public int countNegatives(int[][] grid) {
        int res=0;
        for(int ele[]:grid){
            int ind=calculate(ele);
            if(ind!=Integer.MIN_VALUE)res+=ele.length-ind;
        }
        return res;
    }
    public int calculate(int arr[]){
        int ans=Integer.MIN_VALUE;
        int l=0,h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]<0){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}