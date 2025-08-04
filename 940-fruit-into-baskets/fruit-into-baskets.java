class Solution {
    public int totalFruit(int[] fruits) {
       HashMap<Integer,Integer> ans=new HashMap<>();
       int end=0;
       int start=0,max_len=0;
       while(end<fruits.length)
       {
        ans.put(fruits[end],ans.getOrDefault(fruits[end],0)+1);
        while(ans.size()>2)
        {
            ans.put(fruits[start],ans.get(fruits[start])-1);
            if(ans.get(fruits[start])==0)
            {
                ans.remove(fruits[start]);
            }
            start++;
        }
        max_len=Math.max(max_len,end-start+1);
        end++;
       }
       return max_len;
    }
}