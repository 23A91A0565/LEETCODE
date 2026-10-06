class Solution {
    public int minAddToMakeValid(String s) {
        // Stack<Character> st=new Stack<>();
        // int ans=0;
        // for(char ch:s.toCharArray()){
        //     if(ch=='('){
        //         st.push('(');
        //     }
        //     else{
        //         if(!st.isEmpty() && st.peek()=='('){
        //             st.pop();
        //             continue;
        //         }
        //         else{
        //             ans++;
        //         }
        //     }
        // }
        // ans+=st.size();

        // return ans;

        int open=0;
        int close=0;
        int res=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                open++;
            }
            else{
                if(open>0){
                    open--;
                }
                else{
                    res++;
                }
            }
        }
        res+=open;
        return res;
    }
}