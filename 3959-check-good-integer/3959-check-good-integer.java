class Solution {
    public boolean checkGoodInteger(int n) {
        int s1=0,s2=0;
        while(n!=0){
            int r=n%10;
            s1+=r*r;
            s2+=r;
            n=n/10;
        }
        return s1-s2>=50;
    }
}