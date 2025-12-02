class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> ans=new HashSet<>();
        for(char c:s.toCharArray()){
            if(ans.contains(c)){
                return c;
            }
            ans.add(c);
        }
        return s.charAt(0);
    }
}