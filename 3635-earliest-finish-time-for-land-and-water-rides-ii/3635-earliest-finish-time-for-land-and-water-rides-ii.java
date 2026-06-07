class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int time1=finish(landStartTime,landDuration,waterStartTime,waterDuration);
        int time2=finish(waterStartTime,waterDuration,landStartTime,landDuration);
        return Math.min(time1,time2);
    }
    public int finish(int c1[],int c2[],int d1[],int d2[]){
        int min=Integer.MAX_VALUE;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<c1.length;i++){
            min=Math.min(min,c1[i]+c2[i]);
        }
        for(int i=0;i<d1.length;i++){
            int fin=Math.max(min,d1[i])+d2[i];
            res=Math.min(res,fin);
        }
        return res;
    }
}