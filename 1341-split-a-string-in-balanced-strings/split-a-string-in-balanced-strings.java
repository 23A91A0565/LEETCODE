class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int chCount = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'R') {
                chCount++;
            } else {
                chCount--;
            }
            if (chCount == 0) {
                count++;
            }
        }
        return count;
    }
}