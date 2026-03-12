class Solution {
public:
    int totalWaviness(int num1, int num2) {
        int res=0;
        for(int i=num1;i<=num2;i++){
            res+=cal(i);
        }
        return res;
    }
    int cal(int num){
        string s=to_string(num);
        int n=s.size();
        int ans=0;
        for(int i=1;i<n-1;i++){
            int left=s[i-1]-'0';
            int curr=s[i]-'0';
            int right=s[i+1]-'0';
            if((curr>left && curr>right) || (curr<left && curr<right))ans++;
        }
        return ans;
    }
};