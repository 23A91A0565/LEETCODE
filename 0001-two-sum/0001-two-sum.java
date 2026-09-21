class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int i=0;
        for(int ele:nums){
            int req=target-ele;
            if(h.containsKey(req)){
                return new int[]{h.get(req),i};
            }
            h.put(ele,i);
            i++;
        }
        return new int[]{-1,-1};
    }
}