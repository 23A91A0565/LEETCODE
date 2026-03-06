class Solution {
    public boolean checkOnesSegment(String s) {
        int c=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1' && i-c !=1){
                return false;
            }
            if(s.charAt(i)=='1' && i-c==1){
                c=i;
            }
        }
        return true;
    }
}