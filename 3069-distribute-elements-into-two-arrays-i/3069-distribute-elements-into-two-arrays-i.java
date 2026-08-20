class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr1.isEmpty()){
                arr1.add(nums[i]);
            }
            else if(arr2.isEmpty()){
                arr2.add(nums[i]);
            }
            else{
                if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
                    arr1.add(nums[i]);
                }
                else{
                    arr2.add(nums[i]);
                }
            }
        }
        int res[]=new int[n];
        int j=0;
        for(int i=0;i<arr1.size();i++){
            res[j++]=arr1.get(i);
        }
        for(int i=0;i<arr2.size();i++){
            res[j++]=arr2.get(i);
        }
        return res;
    }
}