class Solution {
    public int countofbeam(String beam){
       int sum=0;
       for(char ch:beam.toCharArray()){
        sum+=ch-'0';
        }
        return sum;
    }
    public int numberOfBeams(String[] bank) {
        int sum=0;
        int prev=0;
        for(int i=0;i<bank.length;i++){
            int curr=countofbeam(bank[i]);
            if(curr>0){
                sum+=prev*curr;
                prev=curr;
            }
        }
       return sum;
    }
}