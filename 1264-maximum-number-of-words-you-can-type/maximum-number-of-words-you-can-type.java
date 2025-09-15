class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String words[]=text.trim().split("\\s+");
        char lett[]=brokenLetters.toCharArray();
        int res=0;
        for(String s:words){
            if(isSafe(s,lett)){
                res++;
            }
        }
        return res;
    }
    public boolean isSafe(String s,char lett[]){
        for(char c:lett){
            if(s.indexOf(c)!=-1){
                return false;
            }
        }
        return true;
    }
}