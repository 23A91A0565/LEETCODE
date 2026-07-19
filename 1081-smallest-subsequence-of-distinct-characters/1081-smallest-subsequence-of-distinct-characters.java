class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        boolean vis[]=new boolean[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']--;
            if(vis[s.charAt(i)-'a'])continue;
            vis[s.charAt(i)-'a']=true;
            while(!st.isEmpty() && st.peek()>s.charAt(i) && freq[st.peek()-'a']>0){
                vis[st.peek()-'a']=false;
                st.pop();
            }
            st.push(s.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}