class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int i=0,j=n-1;
        while(i<j){
            // while(i>0 && numbers[i]==numbers[i-1]){
            //     i++;
            // }
            // while(j<n-1 && numbers[j]==numbers[j+1]){
            //     j--;
            // }
            if(numbers[i]+numbers[j]==target){
                return new int[]{i+1,j+1};
            }
            else if(numbers[i]+numbers[j]>target){
                j--;
            }
            else{
                i++;
            }
            
        }
        return new int[]{-1,-1};
    }
}