class Solution {
public:
    int minimumDeletions(vector<int>& nums) {
        int ma=nums[0];
        int maxi=0;
        int mi=nums[0];
        int mini=0;
        int n=nums.size();
        for(int i=1;i<n;i++){
            if(nums[i]<mi){
                mi=nums[i];
                mini=i;
            }
            if(nums[i]>ma){
                ma=nums[i];
                maxi=i;
            }
        }
        int res=INT_MAX;
        int front_ind=min(mini,maxi);
        int next_ind=max(mini,maxi);
        // deleting from front
        res=min(res,next_ind+1);
        //deleting from back
        res=min(res,n-front_ind);
        //deleting from both sides
        res=min(res,front_ind+1+n-next_ind);
        return res;
    }
};