class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> ans=new ArrayList<>();
        int j=0;
        for(int i=1;i<=n && j<target.length;i++){
            if(target[j]==i)
            {
                j++;
                ans.add("Push");
            }
            else{
                ans.add("Push");
                ans.add("Pop");
            }
        }
        return ans;
    }
}