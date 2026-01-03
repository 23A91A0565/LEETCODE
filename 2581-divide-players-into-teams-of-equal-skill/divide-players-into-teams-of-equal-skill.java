class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long res=0,prev=0;
        int i=0,j=skill.length-1;
        while(i<=j){
            long sum=skill[i]+skill[j];
            long cal=skill[i]*skill[j];
            if(prev!=0 && prev!=sum){
                return -1;
            }
            prev=sum;
            res+=cal;
            i++;
            j--;
        }
        return res;
    }
}