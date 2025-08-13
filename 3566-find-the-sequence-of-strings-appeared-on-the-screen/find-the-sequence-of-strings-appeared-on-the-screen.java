class Solution {
    public List<String> stringSequence(String target) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char targetChar : target.toCharArray()) {
            sb.append('a');
            ans.add(sb.toString());
            for (char c = 'b'; c <= targetChar; ++c) {
                sb.setCharAt(sb.length() - 1, c);
                ans.add(sb.toString());
            }
        }
        return ans;
        
        // [OR]

        /* ArrayList<String> ans=new ArrayList<>();
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
        return ans; */
    }
}