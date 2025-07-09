class Solution {
    public String reversePrefix(String word, char ch) {
        int k=word.indexOf(ch);
        String s1=word.substring(0,k+1);
        String s2=word.substring(k+1);
        StringBuilder sb=new StringBuilder(s1);
        sb.reverse();
        return sb.toString()+s2;
    }
}