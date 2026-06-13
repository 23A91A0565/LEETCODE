class Solution {
    public List<String> generateValidStrings(int n, int k) {
        ArrayList<String> ans=new ArrayList<>();
        String s="";
        solve(s,0,n,k,ans);
        return ans;
    }
    public void solve(String s, int curr_cos,int n,int k,ArrayList<String> ans){
        if(s.length()==n){
            if(curr_cos<=k){
                ans.add(s);
            }
            return;
        }
        if(s.equals("") || s.charAt(s.length()-1)=='0'){
            solve(s+"0",curr_cos,n,k,ans);
            solve(s+"1",curr_cos+s.length(),n,k,ans);
        }
        else{
            solve(s+"0",curr_cos,n,k,ans);
        }
    }
}