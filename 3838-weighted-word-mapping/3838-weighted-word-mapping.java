class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        for(String s:words){
            int val=0;
            for(char c:s.toCharArray()){
                val+=weights[c-'a'];
            }
            val=val%26;
            val='z'-val;
            sb.append((char)val);
        }
        return sb.toString();
    }
}