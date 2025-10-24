class Solution {
    public boolean isBalanced(int num) {
        String s = String.valueOf(num);
        int[] count = new int[10];
        for (char c : s.toCharArray()) {
            int d = c - '0';
            if (d == 0) return false;
            count[d]++;
        }
        for (int d = 1; d <= 9; d++) {
            if (count[d] > 0 && count[d] != d) return false;
        }
        return true;
    }
    
    public int nextBeautifulNumber(int n) {
        int x = n + 1;
        while (true) {
            if (isBalanced(x)) return x;
            x++;
        }
    }
}
