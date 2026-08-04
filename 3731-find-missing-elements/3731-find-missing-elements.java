class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        List<Integer> ans=new ArrayList<>();
        for(int ele:nums){
            min=Math.min(min,ele);
            max=Math.max(max,ele);
        }
        boolean check[]=new boolean[max+1];
        for(int ele:nums){
            check[ele]=true;
        }
        for(int i=min;i<=max;i++){
            if(!check[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}