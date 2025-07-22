class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score,(a,b)->b[k]-a[k]);
        return score;

        //  [OR]

        /*for(int i=0;i<score.length;i++)
        {
            for(int j=0;j<score.length;j++)
            {
                if(score[i][k]>score[j][k])
                {
                    swap(score[i],score[j],score[0].length);
                }
            }
        }
        return score;
    }
    public static void swap(int a[],int b[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int temp=a[i];
            a[i]=b[i];
            b[i]=temp;
        }*/
    }
}