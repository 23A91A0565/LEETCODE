class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        solve(ans,"",0,0,n);
        return ans;
    }
    public static void solve(List<String> ans,String s,int open,int close,int n){
        if(open==n && close==n){
            ans.add(s);
            return;
        }
        if(open<n){
            solve(ans,s+'(',open+1,close,n);
        }
        if(close<open){
            solve(ans,s+')',open,close+1,n);
        }
    }
}