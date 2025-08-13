class Solution {
    public List<String> stringSequence(String target) {
        ArrayList<String> ans=new ArrayList<>();
        String s="a";
        ans.add(s);
        while(!s.equals(target)){
            int n=s.length();
            if(s.charAt(n-1)==target.charAt(n-1))
            {
              s+="a";  
            }
            else{
                s=s.substring(0, n-1)+ (char)(s.charAt(n-1)+ 1) ;
            }
            
            ans.add(s);
        }
        return ans;
    }
}