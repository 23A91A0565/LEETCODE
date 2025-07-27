class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for (int center = 0; center < s.length(); center++) {
            count += expandFromCenter(s, center, center);
            count += expandFromCenter(s, center, center + 1);
        }
        return count;
    }

    private int expandFromCenter(String s, int left, int right) {
        int Count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            Count++;
            left--;
            right++;
        }

        return Count;
    }
}
