class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        char[] result = new char[s.length()];
        int left = 0;
        int right = s.length() - 1;
        Character middleChar = null;

        for (int i = 0; i < 26; i++) {
            char ch = (char)(i + 'a');
            while (freq[i] >= 2) {
                result[left++] = ch;
                result[right--] = ch;
                freq[i] -= 2;
            }
            if (freq[i] == 1 && middleChar == null) {
                middleChar = ch;
                freq[i]--;
            }
        }

        if (middleChar != null) {
            result[left] = middleChar;
        }

        return new String(result);
    }
}