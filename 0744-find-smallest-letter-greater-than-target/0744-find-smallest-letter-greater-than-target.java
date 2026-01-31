class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char p=letters[0];
        Arrays.sort(letters);
        for(char c:letters){
            if(c>target){
                return c;
            }
        }
        return p;
    }
}