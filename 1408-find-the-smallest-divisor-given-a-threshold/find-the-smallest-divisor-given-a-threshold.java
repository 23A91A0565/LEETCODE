class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int h=max(nums);
        int l=1;
        while(l<=h){
            int mid=(l+h)/2;
            if(sum(nums,mid)<=threshold){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    public static int max(int[] nums){
        int m=Integer.MIN_VALUE;
        for(int i:nums){
            m=Math.max(m,i);
        }
        return m;
    }
     public static int sum(int[] arr, int div) {
        int n = arr.length; 
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double)(arr[i]) / (double)(div));
        }
        return sum;
    }
}