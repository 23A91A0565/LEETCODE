class Solution {
    public int countHillValley(int[] nums) {
     int c = 0;
        for(int i=1;i<nums.length-1;i++) {
            if(nums[i] == nums[i-1]) continue;
            int val = nums[i];
            int left = i-1;
            int right = i+1;
            while(left >= 0 && val == nums[left]) {
                left--;
            }
            while(right < nums.length && val == nums[right]) {
                right++;
            }
            
            if(left >= 0 && right < nums.length) {
                if(val > nums[left] && val > nums[right]) {
                    c++;
                } 
                else if(val < nums[left] && val < nums[right]) {
                    c++;
                }
            }
        }
        return c;


        //    [OR]
     
     
     /*int c=0;
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
     return c;*/
    }
}