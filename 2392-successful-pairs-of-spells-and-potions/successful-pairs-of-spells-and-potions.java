class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int res[]=new int[spells.length];
        for(int i=0;i<spells.length;i++){
            int ind=Integer.MAX_VALUE;
            int left=0,right=potions.length-1;
            while(left<=right){
                int mid=(left+right)/2;
                if((long)potions[mid]*spells[i]>=success){
                    ind=mid;
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            res[i]=ind==Integer.MAX_VALUE?0:potions.length-ind;
        }
        return res;
    }
}