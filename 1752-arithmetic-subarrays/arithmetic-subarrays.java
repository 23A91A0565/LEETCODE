class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int n=nums.length;
        int m=l.length;
        ArrayList<Boolean> ans=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            int a[]=Arrays.copyOfRange(nums,l[i],r[i]+1);
            Arrays.sort(a);
            int diff=a[0]-a[1];
            int c=0;
            for(int j=2;j<a.length;j++)
            {
                if(a[j-1]-a[j]!=diff)
                {
                    c=1;
                    break;
                }
            }
            if(c==1)
            {
                ans.add(false);
            }
            else{
                ans.add(true);
            }
        }
        return ans;  
    }
}