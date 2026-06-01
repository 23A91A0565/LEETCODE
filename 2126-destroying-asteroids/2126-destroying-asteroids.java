class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int n=asteroids.length;
        long m=mass;
        Arrays.sort(asteroids);
        for(int i=0;i<n;i++){
            if(m<asteroids[i])return false;
            m+=asteroids[i];
        }
        return true;
    }
}