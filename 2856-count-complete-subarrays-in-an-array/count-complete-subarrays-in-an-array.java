class Solution {
    public int countCompleteSubarrays(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        int k=0;
        for(int i:nums)
        {
            if(!l.contains(i))
            {
                l.add(i);
                k+=1;
            }
        }
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> st = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                st.add(nums[j]);
                if (st.size() == k) res++;
            }
        }
        return res;
    }
}