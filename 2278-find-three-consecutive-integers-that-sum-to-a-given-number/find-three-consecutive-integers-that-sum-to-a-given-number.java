class Solution {
    public long[] sumOfThree(long num) {
        long ans[]=new long[3];
        long middle=num/3;
        boolean isExit=false;
        if(3*middle==num){
            ans[0]=middle-1;
            ans[1]=middle;
            ans[2]=middle+1;
            isExit=true;
        }
        if(isExit)return ans;
        else return new long[0];
    }
}