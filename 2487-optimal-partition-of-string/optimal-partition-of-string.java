class Solution {
    public int partitionString(String s) {
        ArrayList<Character> ans=new ArrayList<>();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(!ans.contains(s.charAt(i)))
            {
                ans.add(s.charAt(i));
            }
            else{
                c+=1;
                ans.clear();
                ans.add(s.charAt(i));
            }
        }
        return c+1;
    }
}