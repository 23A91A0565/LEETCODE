class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<=2)return n;
        // we can get the unique elements from 0 to 2^bitlen(n)-1
        // Because when you xor , some bits may cancelled with each other and returns unique values from 0 to 2^bitlen(n)
        return 1<<(32-Integer.numberOfLeadingZeros(n));
        // Integer.numberOfLeadingZeros will gives the num of zeros before first appearence of one 
        // 32-Integer.numberOfLeadingZeros will gives num of bits required to represent
    }
}