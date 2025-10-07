class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        backtrack(nums,ans,new ArrayList<>(),used);
        return ans;
    }
    public static void backtrack(int nums[],List<List<Integer>> ans,ArrayList<Integer> dup,boolean used[]){
        if(dup.size()==nums.length){
            ans.add(new ArrayList<>(dup));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i])continue;
            dup.add(nums[i]);
            used[i]=true;
            backtrack(nums,ans,dup,used);
            dup.remove(dup.size()-1);
            used[i]=false;
        }

    }
}