class Solution {
    public boolean sumGame(String num) {
        int leftSum=0;
        int rightSum=0;
        int q1=0;
        int q2=0;
        int mid=num.length()/2;
        for(int i=0;i<num.length();i++){
            if(i<mid){
                if(num.charAt(i)=='?'){
                    q1++;
                }
                else{
                    leftSum+=num.charAt(i)-'0';
                }
            }
            else{
                if(num.charAt(i)=='?'){
                    q2++;
                }
                else{
                    rightSum+=num.charAt(i)-'0';
                }
            }
        }
        if((q1+q2)%2!=0){
            return true;
        }
        return leftSum-rightSum != 9*(q2-q1)/2;
    }
}