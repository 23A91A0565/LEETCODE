class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length+nums2.length];
        double median=0;
        System.arraycopy(nums1,0,ans,0,nums1.length);
        System.arraycopy(nums2,0,ans,nums1.length,nums2.length);
        Arrays.sort(ans);
        if(ans.length%2==1)
        {
            median=ans[ans.length/2];
        }
        else{
            median=(ans[ans.length/2]+ans[(ans.length/2)-1])/2.0;
        }
        return median;
    }
}