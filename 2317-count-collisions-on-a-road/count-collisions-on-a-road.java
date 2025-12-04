class Solution {
    public int countCollisions(String directions) {
        int res=0;
        int k=0;
        int n=directions.length();
        while(k<n && directions.charAt(k)=='L') {
            k++;
        }
        int j=n-1;
        while(j>= 0 && directions.charAt(j)=='R'){
            j--;
        }
        if(k>j)return 0;
        for(int i=k;i<=j;i++) {
            if(directions.charAt(i)!='S') {
                res++;
            }
        }
        return res;
    }
}