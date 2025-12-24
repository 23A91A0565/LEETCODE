class Solution {
    public long minCost(String s, int[] cost) {
        long sum=0;
        for(int ele:cost){
            sum+=ele;
        }
        HashMap<Character,Long> ans=new HashMap<>();
        for(int i=0;i<s.length();i++){
            ans.put(s.charAt(i),ans.getOrDefault(s.charAt(i),0L)+cost[i]);
        }
        if(ans.size()==1){
            return 0;
        }
        long max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            max=Math.max(max,ans.get(s.charAt(i)));
        }
        return sum-max;
    }
}