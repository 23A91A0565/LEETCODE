class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int c = 0;
        int n = fruits.length;
        boolean[] usedBaskets = new boolean[n];
        for (int i = 0; i < n; i++) {
            boolean placed = false;
            for (int j = 0; j < n; j++) {
                if (!usedBaskets[j] && fruits[i] <= baskets[j]) {
                    usedBaskets[j] = true; 
                    placed = true; 
                    break;  
                }
            }
            if (!placed) {
                c++;
            }
        }

        return c;
    }
}