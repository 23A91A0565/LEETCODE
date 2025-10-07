class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums,ans,used,new ArrayList<>());
        return ans;
    }
    public static void backtrack(int nums[],List<List<Integer>> ans,boolean used[],ArrayList<Integer> store){
        if(store.size()==nums.length){
            ans.add(new ArrayList<>(store));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i])continue;

            if(i>0 && nums[i]==nums[i-1] && !used[i-1])continue;

            store.add(nums[i]);
            used[i]=true;
            backtrack(nums,ans,used,store);
            store.remove(store.size()-1);
            used[i]=false;
        }
    }
}