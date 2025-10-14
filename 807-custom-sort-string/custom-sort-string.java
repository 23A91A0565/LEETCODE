class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb=new StringBuilder();
        HashMap<Character,Integer> ans=new HashMap<>();
        for(char c:s.toCharArray()){
            ans.put(c,ans.getOrDefault(c,0)+1);
        }
        for(char c:order.toCharArray()){
            if(ans.containsKey(c)){
                int d=ans.get(c);
                while(d-->0){
                    sb.append(c);
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
                sb.append(c);
            }
        }
        return sb.toString();
    }
}