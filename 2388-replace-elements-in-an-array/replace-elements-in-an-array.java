class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            ans.put(nums[i],i);
        }

        for(int ele[] : operations){
            int old=ele[0];
            int newEle=ele[1];

            int index=ans.get(old);
            ans.remove(old);
            ans.put(newEle,index);
        }

        int res[]=new int[nums.length];
        for (Map.Entry<Integer, Integer> entry:ans.entrySet()) {
            res[entry.getValue()] = entry.getKey();
        }
        return res;
    }
}