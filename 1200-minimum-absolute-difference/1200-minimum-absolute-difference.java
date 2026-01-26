class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        if(arr.length==1)return ans;

        for(int i=0;i<arr.length-1;i++){
            min=Math.min(min,arr[i+1]-arr[i]);
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==min){
                List<Integer> st=new ArrayList<>();
                st.add(arr[i]);
                st.add(arr[i+1]);
                ans.add(st);
            }
            else{
                continue;
            }
        }
        return ans;
    }
}