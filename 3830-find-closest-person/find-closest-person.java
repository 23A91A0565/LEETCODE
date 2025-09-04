class Solution {
    public int findClosest(int x, int y, int z) {
        int x_dis=Math.abs(x-z);
        int y_dis=Math.abs(y-z);
        if(x_dis<y_dis){
            return 1;
        }
        else if(y_dis<x_dis){
            return 2;
        }
        else{
            return 0;
        }
    }
}