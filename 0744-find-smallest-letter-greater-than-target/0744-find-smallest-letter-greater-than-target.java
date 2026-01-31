class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char p=letters[0];
        for(char c:letters){
            if(c>target){
                return c;
            }
        }
        return p;
    }
}