class Solution {
    public int sumBase(int n, int k) {
        String baseK = Integer.toString(n, k);
        int ans=Integer.parseInt(baseK);
        int sum=0;
        while(ans!=0)
        {
            sum+=ans%10;
            ans=ans/10;
        }
        return sum;
    }
}