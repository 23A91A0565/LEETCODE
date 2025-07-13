class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            if (Character.isLowerCase(c)) set.add(c);
        }
        return set.size() == 26;
    }
}