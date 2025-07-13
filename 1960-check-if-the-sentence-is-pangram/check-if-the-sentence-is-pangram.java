class Solution {
    public boolean checkIfPangram(String sentence) {
        sentence.toLowerCase();
        for(int i='a';i<='z';i++)
        {
            if(!sentence.contains(String.valueOf((char)i)))
            {
                return false;
            }
        }
        return true;
    }
}