class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i:nums){
            ans.add(i);
        }
        int c=0;
        while(!isSorted(ans)){
            int ind=minPair(ans);
            ans.set(ind,ans.get(ind)+ans.get(ind+1));
            ans.remove(ind+1);
            c+=1;
        }
        return c;
    }
    public boolean isSorted(ArrayList<Integer> nums){
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)>nums.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public int minPair(ArrayList<Integer> ans){
        int min=Integer.MAX_VALUE;
        int ind=-1;
        for(int i=0;i<ans.size()-1;i++){
            if(ans.get(i)+ans.get(i+1)<min){
                min=ans.get(i)+ans.get(i+1);
                ind=i;
            }
        }
        return ind;
    }
}