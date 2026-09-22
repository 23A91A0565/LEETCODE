class Solution {
    public List<String> commonChars(String[] words) {
        // List<String> l=new ArrayList<>();
        // for(int i=0;i<26;i++){
        //     char ch=(char)('a'+i);
        //     int min=Integer.MAX_VALUE;
        //     for(int j=0;j<words.length;j++){
        //         int freq=0;
        //         for(char c:words[j].toCharArray()){
        //             if(c==ch){
        //                 freq++;
        //             }
        //         }
        //         min=Math.min(min,freq);
        //     }
        //     for(int k=0;k<min;k++){
        //         String s=ch+"";
        //         l.add(s);
        //     }
        // }
        // return l;

        // [ OR ]

        int[] minFreq = new int[26];
        for (int i = 0; i < 26; i++) {
            minFreq[i] = Integer.MAX_VALUE;
        }
        
        for (String word : words) {
            int[] charCount = new int[26];
            for (char c : word.toCharArray()) {
                charCount[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charCount[i]);
            }
        }
        
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }
        
        return result;
    }
}