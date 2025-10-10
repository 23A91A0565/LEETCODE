class Solution {
    int count=0;
    public int countArrangement(int n) {
        if(n==0)return 0;
        boolean res[]=new boolean[n+1];
        backtrack(n,1,res);
        return count;
    }
    public void backtrack(int n,int pos,boolean used[]){
        if(pos>n){
            count++;
            return;
        }
        for(int i=1;i<=n;i++){
            if(!used[i] && (i%pos==0 || pos%i==0)){
                used[i]=true;
                backtrack(n,pos+1,used);
                used[i]=false;
            }
        }
    }
}