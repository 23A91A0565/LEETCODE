class Solution {
    public int[] rotateElements(int[] nums, int k) {
        ArrayList<Integer> ans=new ArrayList<>(); 
        for(int ele:nums){ 
            if(ele>=0){ 
                ans.add(ele); 
            } 
        } 
        int res[]=new int[nums.length]; 
        if(nums.length==0 || k==0 || ans.size()==0)return nums; 
        int size=k%ans.size(); 
        ArrayList<Integer> store=new ArrayList<>(); 
        for(int i=size;i<ans.size();i++){ 
            store.add(ans.get(i)); 
        } 
        for(int i=0;i<size;i++){ 
            store.add(ans.get(i)); 
        } 
        int j=0; 
        for(int i=0;i<nums.length;i++){ 
            if(nums[i]<0){ 
                res[i]=nums[i]; 
            } 
            else{ 
                res[i]=store.get(j); 
                j++; 
            } 
        } 
        return res;
    }
}