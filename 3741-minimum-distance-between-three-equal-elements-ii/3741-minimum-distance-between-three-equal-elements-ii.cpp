class Solution {
public:
    int minimumDistance(vector<int>& nums) {
        unordered_map<int,vector<int>>ans;
        for(int i=0;i<nums.size();i++){
            ans[nums[i]].push_back(i);
        }
        int res=INT_MAX;
        for(auto &ele:ans){
            vector<int>&s=ele.second;
            if(s.size()<3)continue;
            for(int i=0;i<s.size()-2;i++){
                int cal=2*(s[i+2]-s[i]);
                res=min(res,cal);
            }
        }
        return res==INT_MAX?-1:res;
    }
};