class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int n = words.length;
        int[] preVowelCount = new int[n];
        int count = 0;
        for(int i=0; i<words.length;i++){
            String word = words[i];
            if(vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length() - 1))){
                count++;
            }
            preVowelCount[i] = count;
        }
        int[] ans = new int[queries.length];
        int it = 0;
        for(int[] q : queries){
            int st = q[0];
            int end = q[1];
            if(st == 0){
                ans[it++] = preVowelCount[end];
            }
            else{
                ans[it++] = preVowelCount[end] - preVowelCount[st-1];
            }
        }
        return ans;
    }
}