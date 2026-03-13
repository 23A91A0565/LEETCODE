class Solution {
public:
    long long minNumberOfSeconds(int mountainHeight, vector<int>& workerTimes) {
        long long ans=0;
        long long low=0,high=1e16;
        while(low<=high){
            long long mid=(low+high)/2;
            long long val=isPoss(mid,workerTimes);
            if(val>=mountainHeight){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    long long isPoss(long long t,vector<int>& workerTimes){
        int n=workerTimes.size();
        long long res=0;
        for(int i=0;i<n;i++){
            long long val=(2*t)/workerTimes[i];
            res+=(long long)((-1+sqrt(1+val*4.0))/2);
        }
        return res;
    }
};