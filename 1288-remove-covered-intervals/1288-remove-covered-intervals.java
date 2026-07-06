class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if (a[0]==b[0])
                return b[1]-a[1];
            return a[0]-b[0];
        });
        int i=0,j=0;
        int c=0;
        while(i<intervals.length){
            int a=intervals[i][0];
            int b=intervals[i][1];
            j=i+1;
            while(j<intervals.length && a<=intervals[j][0] && b>=intervals[j][1]){
                c+=1;
                j++;
            }
            i=j;
        }
        return intervals.length-c;
    }
}