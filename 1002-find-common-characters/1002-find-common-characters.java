class Solution {
    public List<String> commonChars(String[] words) {
        List<String> l=new ArrayList<>();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            int min=Integer.MAX_VALUE;
            for(int j=0;j<words.length;j++){
                int freq=0;
                for(char c:words[j].toCharArray()){
                    if(c==ch){
                        freq++;
                    }
                }
                min=Math.min(min,freq);
            }
            for(int k=0;k<min;k++){
                String s=ch+"";
                l.add(s);
            }
        }
        return l;
    }
}