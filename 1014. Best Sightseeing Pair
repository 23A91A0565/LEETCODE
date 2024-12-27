class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = 0;
        int maxPrefix = values[0];
        for (int j = 1; j < values.length; j++) {
            maxScore = Math.max(maxScore, maxPrefix + values[j] - j);
            maxPrefix = Math.max(maxPrefix, values[j] + j);
        }

        return maxScore;
    }
}
