class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder(); 
        for(int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                sb.append(ch);
            }
        }

        char[] charArray = sb.toString().toCharArray();
        Arrays.sort(charArray);
        String s1="";
        int j = 0;
        for(int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                s1 = s1+charArray[j];
                j++;
            }
            else{
                s1 = s1+s.charAt(i);
            }
            
        }
        return s1;
    }
}
