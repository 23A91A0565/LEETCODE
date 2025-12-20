class Solution {
    public int minDeletionSize(String[] strs) {
        int c=0;
        int n=strs.length;
        int m=strs[0].length();
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                if(strs[j-1].charAt(i)>strs[j].charAt(i)){
                    c+=1;
                    break;
                }
            }
        }
        return c;
    }
}