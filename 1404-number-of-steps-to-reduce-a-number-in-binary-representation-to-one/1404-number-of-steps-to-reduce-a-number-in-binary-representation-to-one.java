class Solution {
    public int numSteps(String s) {
        int c=0;
        int carry=0;
        for(int i=s.length()-1;i>0;i--){
            int curr=s.charAt(i)-'0';
            if((carry^curr)==1){
                c+=2;
                carry=1;
            }
            else{
                c+=1;
            }
        }
        return c+carry;
    }
}