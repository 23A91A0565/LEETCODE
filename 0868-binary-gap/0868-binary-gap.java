class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int prev=Integer.MAX_VALUE,curr=Integer.MAX_VALUE;
        int max=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='1'){
                if(curr!=Integer.MAX_VALUE){
                    prev=curr;
                    curr=i;
                    max=Math.max(max,curr-prev);
                }
                else if(curr==Integer.MAX_VALUE){
                    curr=i;
                }
            }
            i++;
        }
        return max;
    }
}