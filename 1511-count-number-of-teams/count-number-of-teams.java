class Solution {
    public int numTeams(int[] rating) {
        int c=0;
        for(int i=1;i<rating.length-1;i++)
        {
            int left_small=0,left_great=0;
            int right_small=0,right_great=0;
            for(int j=0;j<i;j++)
            {
                if(rating[i]>rating[j])
                {
                    left_small++;
                }
                else{
                    left_great++;
                }
            }
            for(int j=i+1;j<rating.length;j++)
            {
                if(rating[i]<rating[j])
                {
                    right_great++;
                }
                else{
                    right_small++;
                }
            }
            c+=(left_small*right_great)+(left_great*right_small);
        }
        return c;
    }
}