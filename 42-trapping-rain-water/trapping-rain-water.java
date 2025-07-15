class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int lmax=0,rmax=0;
        int total=0;
        while(left<right)
        {
            if(height[left]<height[right])
            {
                if(lmax<height[left])
                {
                    lmax=height[left];
                }
                else{
                    total+=lmax-height[left];
                }
                 left++;
            }
            else{
                if(rmax<height[right])
                {
                    rmax=height[right];
                }
                else{
                    total+=rmax-height[right];
                }
                  right--;
            }
        }
        return total;
    }
}