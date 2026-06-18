class Solution {
    public double angleClock(int hour, int minutes) {
        double min_angle=minutes*6.0; // 360 deg / 60 min * ( x min)
        double hou_angle=30.0*(hour%12)+0.5*minutes; // 360 deg / 12 hou * (x hou) + 360 deg / 720 min for 12 hou * (x min) 
        double diff=Math.abs(min_angle-hou_angle);
        return Math.min(diff,360-diff);
    }
}