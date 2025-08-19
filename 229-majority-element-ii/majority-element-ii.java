class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            ans.put(nums[i],ans.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int ele:ans.keySet()){
            if(ans.get(ele)>nums.length/3){
                res.add(ele);
            }
        }
        return res;
    }
}