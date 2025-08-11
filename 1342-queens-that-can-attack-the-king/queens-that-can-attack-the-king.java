class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        boolean[][] hasQueen = new boolean[8][8];
        for (int[] q : queens) hasQueen[q[0]][q[1]] = true;
        List<List<Integer>> res = new ArrayList<>();
        int[][] moves = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1},
            {-1, -1}, {-1, 1}, {1, -1}, {1, 1}
        };

        for (int[] d : moves) {
            int x = king[0] + d[0];
            int y = king[1] + d[1];
            while (x >= 0 && x < 8 && y >= 0 && y < 8) {
                if (hasQueen[x][y]) {
                    res.add(Arrays.asList(x, y));
                    break;
                }
                x += d[0];
                y += d[1];
            }
        }
        return res;
    }
}