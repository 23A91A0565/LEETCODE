class Solution {
    public int numberOfSpecialChars(String word) {
        int c=0;
        for(int i=0;i<26;i++){
            char lo=(char)(i+'a');
            char up=(char)(i+'A');
            if(word.indexOf(lo)!=-1 && word.indexOf(up)!=-1){
                c+=1;
            }
        }
        return c;
    }
}