class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int totalCount = 0;
        int sum = 0;
        HashMap<Integer,Integer> ans=new HashMap<>();
        ans.put(0,1);
        
        for (int num : nums) {
            sum += num;
            if(ans.containsKey(sum-goal)){
                totalCount += ans.get(sum-goal);
            }
            ans.put(sum,ans.getOrDefault(sum,0)+1);
        }
        
        return totalCount;
    }
}