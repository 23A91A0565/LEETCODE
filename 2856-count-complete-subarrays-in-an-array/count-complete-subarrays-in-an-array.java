class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int k = set.size();

        int left = 0, right = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (right < nums.length) {
            int x = nums[right];
            map.put(x, map.getOrDefault(x, 0) + 1);

            while (map.size() == k) {
                count += nums.length - right;

                int y = nums[left];
                map.put(y, map.get(y) - 1);
                if (map.get(y) == 0) map.remove(y);
                left++;
            }

            right++;
        }

        return count;
    }
}




/*
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
*/