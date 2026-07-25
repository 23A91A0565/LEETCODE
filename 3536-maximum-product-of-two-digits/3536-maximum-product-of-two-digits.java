class Solution {
    public int maxProduct(int n) {
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        while(n!=0){
            int r=n%10;
            if(r>max){
                smax=max;
                max=r;
            }
            else if(r>smax){
                smax=r;
            }
            n=n/10;
        }
        return max*smax;
    }
}