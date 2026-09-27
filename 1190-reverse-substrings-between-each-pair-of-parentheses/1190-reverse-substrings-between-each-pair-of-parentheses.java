class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                ArrayList<Character> l=new ArrayList<>();
                while(!st.isEmpty() && st.peek()!='('){
                    l.add(st.peek());
                    st.pop();
                }
                st.pop();
                for(int k=0;k<l.size();k++){
                    st.push(l.get(k));
                }
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.peek());
            st.pop();
        }
        return sb.reverse().toString();
    }
}