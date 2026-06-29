class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i==0){
                if(arr[i]!=1){
                    arr[i]=1;  
                }   
            }
            else if(Math.abs(arr[i]-arr[i-1])>1){
                arr[i]=arr[i-1]+1;
            }
        }
        return arr[n-1];
    }
}