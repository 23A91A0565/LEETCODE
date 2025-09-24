class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        Set<Character> allowedChars = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            allowedChars.add(c); 
        }
        for (String word : words) {
            boolean isConsistent = true;
            for (char wordChar : word.toCharArray()) {
                if (!allowedChars.contains(wordChar)) {
                    isConsistent = false;
                    break; 
                }
            }

            if (isConsistent) count++;
        }

        return count;
    }
}