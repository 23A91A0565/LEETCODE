class Solution {
    public int maxArea(int[] height) {
        int max_area=0;
        int n=height.length;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            int min=Math.min(height[i],height[j]);
            max_area=Math.max(max_area,min*(j-i));
            if(height[i]<height[j])
            {
                i++;
            }
            else{
                j--;
            }
        }
        return max_area;

    }
}