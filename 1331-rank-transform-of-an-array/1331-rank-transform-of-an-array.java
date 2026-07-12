class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int temp[]=arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> ans=new HashMap<>();
        int r=1;
        for(int ele:temp){
            if(!ans.containsKey(ele)){
                ans.put(ele,r++);
            }
        }
        int i=0;
        for(int ele:arr){
            int rank=ans.get(ele);
            arr[i++]=rank;
        }
        return arr;
    }
}