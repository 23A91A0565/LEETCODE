class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        for (int n:nums) {
            int rem=k-n;
            if (map.getOrDefault(rem,0)>0) {
                count++;
                map.put(rem,map.get(rem)-1);
            } else {
                map.put(n,map.getOrDefault(n,0)+1);
            }
        }
        return count;
    }
}