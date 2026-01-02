class Solution {
    public int numSpecialEquivGroups(String[] words) {
        HashSet<String> ans=new HashSet<>();
        for(String s:words){
            StringBuilder even=new StringBuilder();
            StringBuilder odd=new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(i%2==0){
                    even.append(s.charAt(i));
                }
                else{
                    odd.append(s.charAt(i));
                }
            }
            char c1[]=even.toString().toCharArray();
            char c2[]=odd.toString().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            
            String res=new String(c1)+new String(c2);
            ans.add(res);
        }
        return ans.size();
    }
}