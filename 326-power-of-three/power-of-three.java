class Solution {
    public boolean isPowerOfThree(int n) {
        int ans=0;
        for(int i=0;i<31;i++)
        {
            if(Math.pow(3,i)==n){
                return true;
            }
        }
        return false;
    }
}