class Solution {
    public boolean doesAliceWin(String s) {
        String vowels = "aeiou";
        int count = 0;
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count > 0;
    }
}