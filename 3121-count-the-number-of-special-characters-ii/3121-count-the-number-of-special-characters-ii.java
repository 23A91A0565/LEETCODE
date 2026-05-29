class Solution {
    public int numberOfSpecialChars(String word) {
        int cnt=0;
        HashMap<Character,Integer> low=new HashMap<>();
        HashMap<Character,Integer> up=new HashMap<>();
        int len=word.length();
        for(int i=0;i<len;i++){
            char c=word.charAt(i);
            if(Character.isLowerCase(c)){
                low.put(c,i);
            }
            else{
                if(up.containsKey(c)){
                    continue;
                }
                else{
                    up.put(c,i);
                }
            }
        }
        for(int i=0;i<26;i++){
            char l=(char)(i+'a');
            char u=(char)(i+'A');
            if(low.containsKey(l) && up.containsKey(u) && low.get(l)<up.get(u)){
                cnt++;
            }
        }
        return cnt;
    }
}