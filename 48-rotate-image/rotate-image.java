class Solution {
    public void rotate(int[][] matrix) {
        int index = 0;
        int yedek[][] = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                yedek[i][index] = matrix[j][i];
                index++;
            }
            index = 0;
        }
        for (int i = 0; i < yedek.length; i++) {
            for (int j = 0; j < yedek[i].length; j++) {
                matrix[i][j] = yedek[i][j]; 
            }
        }
    }
}