class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if(n%groupSize!=0)return false;
        TreeMap<Integer,Integer> ans=new TreeMap<>();
        for(int ele:hand){
            ans.put(ele,ans.getOrDefault(ele,0)+1);
        }
        while(!ans.isEmpty()){
            int first=ans.firstKey();
            for(int i=0;i<groupSize;i++){
                int ele=first+i;
                if(!ans.containsKey(ele))
                    return false;

                ans.put(ele,ans.get(ele)-1);
                
                if(ans.get(ele)==0){
                    ans.remove(ele);
                }
            }
        }
        return true;
    }
}