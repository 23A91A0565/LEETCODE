class Solution {
    public int minSteps(String s, String t) {
        int n=s.length();
        int m=t.length();
        int c=0;
        int freq[]=new int[26];
        for(int i=0;i<n;i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        for(int j=0;j<m;j++)
        {
            freq[t.charAt(j)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            c+=Math.abs(freq[i]);
        }
        return c;
    }
}