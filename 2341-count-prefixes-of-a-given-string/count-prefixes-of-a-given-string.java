class Solution {
    public int countPrefixes(String[] words, String s) {
        int c=0;
        for(int i=0;i<words.length;i++)
        {
            String a=words[i];
            int len=a.length();
            if(len <= s.length() &&a.equals(s.substring(0,len)))
            {
                c+=1;
            }
        }
        return c;

        /*
        int count=0;
        for(String word:words){
            if(s.startsWith(word)){
                count++;
            }
        }
        return count;
        */
    }
}