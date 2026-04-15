class Solution {
public:
    int closestTarget(vector<string>& words, string target, int startIndex) {
        int res=INT_MAX;
        int n=words.size();
        for(int i=0;i<words.size();i++){
            if(words[i]==target){
                int c=abs(startIndex-i);
                int c2=min(c,n-c);
                res=min(res,c2);
            }
        }
        return res==INT_MAX?-1:res;
    }
};