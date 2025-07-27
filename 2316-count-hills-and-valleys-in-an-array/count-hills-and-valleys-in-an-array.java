class Solution {
    public int countHillValley(int[] nums) {
     int c=0;
     ArrayList<Integer> ans=new ArrayList<>();
     ans.add(nums[0]);
     for(int i=1;i<nums.length;i++)
     {
        if(nums[i]!=nums[i-1])
        {
            ans.add(nums[i]);
        }
     }
     int size=ans.size();
     for(int i=1;i<size-1;i++)
     {
        if(ans.get(i)>ans.get(i-1) && ans.get(i)>ans.get(i+1))
        {
            c+=1;
        }
        else if(ans.get(i)<ans.get(i-1)  &&  ans.get(i)<ans.get(i+1))
        {
            c+=1;
        }
     }
     return c;
    }
}