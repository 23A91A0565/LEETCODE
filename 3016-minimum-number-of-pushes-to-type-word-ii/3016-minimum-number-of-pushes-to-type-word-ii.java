class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> ans=new HashMap<>();
        for(char c:word.toCharArray()){
            ans.put(c,ans.getOrDefault(c,0)+1);
        }
        List<Integer> l=new ArrayList<>(ans.values());
        l.sort(Collections.reverseOrder());
        int res=0;
        for(int i=0;i<l.size();i++){
            res+=(l.get(i)*(i/8+1));
        }
        return res;
    }
}