class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int res=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                int time1=landStartTime[i]+landDuration[i];
                int total1=Math.max(time1,waterStartTime[j])+waterDuration[j];

                int time2=waterStartTime[j]+waterDuration[j];
                int total2=Math.max(time2,landStartTime[i])+landDuration[i];

                res=Math.min(res,Math.min(total1,total2));
            }
        }
        return res;
    }
}