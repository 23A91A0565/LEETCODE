class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> freqS = new HashMap<>();
        HashMap<Character, Integer> freqT = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freqS.put(ch, freqS.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            freqT.put(ch, freqT.getOrDefault(ch, 0) + 1);
        }

        int steps = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int countS = freqS.getOrDefault(ch, 0);
            int countT = freqT.getOrDefault(ch, 0);
            steps += Math.abs(countS - countT);
        }

        return steps / 2;
    }
}