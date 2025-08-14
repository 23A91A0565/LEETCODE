class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int left=0,right=0;
        int sum=0;
        int count=0;
        while(right<n){
            sum += arr[right];
            if (right - left + 1 > k) {
                sum -= arr[left];
                left++;
            }
            if (right - left + 1 == k) {
                if (sum / k >= threshold) {
                    count++;
                }
            }
            right++;
        }
        return count;
    }
}