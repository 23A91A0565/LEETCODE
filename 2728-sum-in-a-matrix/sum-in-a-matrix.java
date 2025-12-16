class Solution {
    public int matrixSum(int[][] nums) {
        int n=nums.length;
        int m=nums[0].length;
        for(int i=0;i<n;i++){
            Arrays.sort(nums[i]);
        }
        int res=0;
        for(int i=0;i<m;i++){
            int max=0;
            for(int j=0;j<n;j++){
                max=Math.max(max,nums[j][i]);
            }
            res+=max;
        }
        return res;
    }
}