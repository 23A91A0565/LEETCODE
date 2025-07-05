class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> l=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            l.put(arr[i],l.getOrDefault(arr[i],0)+1);
        }
        int ans=-1;
        for(int key:l.keySet())
        {
            if(l.get(key)==key)
            {
                ans=key;
            }
        }
        return ans;
    }
}