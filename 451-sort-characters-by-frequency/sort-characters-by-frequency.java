class Solution {
    public String frequencySort(String s) {
        int freq[]=new int[128];
        for(char ch: s.toCharArray()){
            freq[ch]++;
        }
        StringBuilder str=new StringBuilder();

        for(int l=0;l<s.length(); l++){
            int max=freq[0];
            int max_Index=0;

            for(int ind=1; ind<128;ind++){
                if(freq[ind]>max){
                    max=freq[ind];
                    max_Index=ind;
                }
            }
            for(int ind=0; ind<max;ind++){
                str.append((char)max_Index);
            }
            freq[max_Index]=0;
        }
        return str.toString(); 
    }
}