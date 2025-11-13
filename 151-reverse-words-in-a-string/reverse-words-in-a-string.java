class Solution {
    public String reverseWords(String s) {
        String st[]=s.trim().split("\\s+");
        String res="";
        for(int i=st.length-1;i>0;i--){
            res+=st[i]+" ";
        }
        return res+st[0];
    }
}