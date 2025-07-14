class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a[]=new int[2];
        int i=0;
        int j=numbers.length-1;
        while(i<j)
        {
            if(numbers[i]+numbers[j]==target)
            {
                a[0]=i+1;
                a[1]=j+1;
                return a;
            }
            else if(numbers[i]+numbers[j]<target)
            {
                i++;
            }
            else{
                j--;
            }
        }
        return a;

    }
}