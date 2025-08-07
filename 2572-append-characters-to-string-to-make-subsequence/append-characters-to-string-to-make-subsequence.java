class Solution {
    public int appendCharacters(String s, String t) {
        int i=0,j=0,match=0;

        while(i<t.length() && j<s.length())
        {
            if(t.charAt(i)==s.charAt(j))
            {
                match+=1;
                i++;
            }
            j++;
        }
        if(match==t.length())
        {
            return 0;
        }
        else
        {
            return t.length()-match;
        }
    }
}