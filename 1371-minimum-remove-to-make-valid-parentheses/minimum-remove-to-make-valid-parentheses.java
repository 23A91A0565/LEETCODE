class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> ans=new Stack<>();
        int open=0,close=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
            }
            else if(s.charAt(i)==')'){
                close++;
            }

            if(close>open){
                close--;
                continue;
            }
            else{
                ans.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!ans.isEmpty()){
            char c=ans.pop();
            if(open>close && c=='('){
                open--;
                continue;
            }
            else{
                sb.append(c);
            }
        }
        return sb.reverse().toString();
    }
}