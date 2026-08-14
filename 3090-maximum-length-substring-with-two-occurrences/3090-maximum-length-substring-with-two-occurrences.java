class Solution {
    public int maximumLengthSubstring(String s) {
        int i=0,j=0;
        int max=0;
        int freq[]=new int[26];
        while(j<s.length()){
            char c=s.charAt(j);
            freq[c-'a']++;
            while(freq[c-'a']>2){
                freq[s.charAt(i)-'a']--;
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}