class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=Integer.MAX_VALUE;
        for(int ele:nums1){
            if( ele%2!=0 ){
                min=Math.min(min,ele);
            }
        }
        // It means all elements are even
        if(min==Integer.MAX_VALUE){
            return true;
        }
        // we are not able to make odd to even by using even number
        // so we are trying to make even numbers into an odd numbers
        for(int ele:nums1){
            if( ele%2==0 && ele<=min){
                // if it is less than min odd we cannot able to make into an even number
                return false;
            }
        }
        return true;
    }
}