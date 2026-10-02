class Solution {
    List<String> res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        solve(n,0,0,"");
        return res;
    }
    public void solve(int len,int open,int close,String curr){
        if(open==len && close==len){
            res.add(curr);
            return;
        }
        if(open>len || close>len){
            return;
        }
        if(open>close){
            solve(len,open,close+1,curr+')');
        }
        solve(len,open+1,close,curr+'(');
    }
}