class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> store=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            store.put(c,i);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        int max=0;
        int pre=0;
        for(int i=0;i<s.length();i++){
            int index=store.get(s.charAt(i));
            max=Math.max(max,index);
            if(max==i){
                ans.add(max-pre+1);
                pre=max+1;
            }
        }
    return ans;
    }
}