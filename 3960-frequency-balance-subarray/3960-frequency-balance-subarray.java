class Solution {
    public int getLength(int[] nums) {
        int res=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            HashMap<Integer,Integer> ans=new HashMap<>();
            int max=0;
            for(int j=i;j<n;j++){
                ans.put(nums[j],ans.getOrDefault(nums[j],0)+1);
                max=Math.max(max,ans.get(nums[j]));
                if(isbalance(ans,max)){
                    res=Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
    public boolean isbalance(HashMap<Integer,Integer> ans,int max){
    if(ans.size()==1){
        return true;
    }
    if((max & 1) == 1){
        return false;
    }
    int half = max / 2;

    boolean hasMax = false;
    boolean hasHalf = false;

    for(int f : ans.values()){
        if(f == max){
            hasMax = true;
        }
        else if(f == half){
            hasHalf = true;
        }
        else{
            return false;
        }
    }
    return hasMax && hasHalf;
    }
}