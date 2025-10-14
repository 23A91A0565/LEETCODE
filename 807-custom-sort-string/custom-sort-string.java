class Solution {
    public String customSortString(String order, String s) {
        String res="";
        HashMap<Character,Integer> ans=new HashMap<>();
        for(char c:s.toCharArray()){
            ans.put(c,ans.getOrDefault(c,0)+1);
        }
        for(char c:order.toCharArray()){
            if(ans.containsKey(c)){
                int d=ans.get(c);
                while(d-->0){
                    res+=c;
                }
                ans.remove(c);
            }
            else{
                continue;
            }
        }
        for(char c:ans.keySet()){
            int d=ans.get(c);
            while(d-->0){
                res+=c;
            }
        }
        return res;
    }
}