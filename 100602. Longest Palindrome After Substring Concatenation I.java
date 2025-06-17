class Solution {
    public int longestPalindrome(String s, String t) {
        int maxLen = 0;
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                String sSub = s.substring(i, j);
                for (int k = 0; k <= t.length(); k++) {
                    for (int l = k; l <= t.length(); l++) {
                        String tSub = t.substring(k, l);
                        String combined = sSub + tSub;
                        if (isPalindrome(combined)) {
                            maxLen = Math.max(maxLen, combined.length());
                        }
                    }
                }
            }
        }
        return maxLen;
    }
    
    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
