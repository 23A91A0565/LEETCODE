class Solution {
    public int minSwaps(String s) {
        Stack<Character> ans=new Stack<>();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='[')
            {
                ans.push('[');
            }
            else{
                if(!ans.isEmpty())
                {
                    ans.pop();
                }
                else{
                    c+=1;
                }
            }
        }
        return (c+1)/2;
    }
}