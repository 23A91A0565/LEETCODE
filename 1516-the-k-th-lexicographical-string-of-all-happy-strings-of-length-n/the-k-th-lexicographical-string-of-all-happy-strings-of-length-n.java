class Solution {
    public String getHappyString(int n, int k) {
        ArrayList<String> ans=new ArrayList<>();
        solve(ans,n,"",' ');
        if(ans.size()<k){
            return "";
        }
        else{
            return ans.get(k-1);
        }
    }
    public static void solve(ArrayList<String> ans,int n,String s,char prev){
        if(s.length()==n){
            ans.add(s);
            return;
        }
        for(char ch:new char[]{'a','b','c'}){
            if(ch!=prev){
                solve(ans,n,s+ch,ch);
            }
        }
    }
}