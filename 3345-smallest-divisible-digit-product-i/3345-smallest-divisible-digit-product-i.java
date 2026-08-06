class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int sum=1;
            int k=n;
            while(k!=0){
                int r=k%10;
                sum*=r;
                k=k/10;
            }
            if(sum%t==0)return n;
            n+=1;
        }
    }
}