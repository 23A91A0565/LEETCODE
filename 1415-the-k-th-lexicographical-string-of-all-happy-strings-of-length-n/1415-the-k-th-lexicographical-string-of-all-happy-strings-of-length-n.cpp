class Solution {
public:
    string getHappyString(int n, int k) {
        vector<string> ans;
        string temp="";
        solve(ans,n,temp);
        if(ans.size()>=k)return ans[k-1];
        return "";
    }
    void solve(vector<string> &ans,int n,string curr){
        if(curr.size()==n){
            ans.push_back(curr);
            return;
        }
        if(curr.size()>n)return;
        for(char c='a';c<='c';c++){
            if(curr.empty() || curr[curr.size()-1]!=c){
                curr.push_back(c);
                solve(ans,n,curr);
                curr.pop_back();
            }
        }
    }
};