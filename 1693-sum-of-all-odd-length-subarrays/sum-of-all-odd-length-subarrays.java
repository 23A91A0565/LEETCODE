class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int sum=0;
          
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                 int l=j-i+1;
                 if(l%2==1){
                    int temp=0;
                    for(int k=i;k<=j;k++){
                        temp+=arr[k];
                    
                    }
                    sum+=temp;
                }
            }
        }
       
        return sum;
    }
}