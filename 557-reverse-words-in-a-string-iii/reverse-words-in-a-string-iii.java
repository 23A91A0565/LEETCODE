class Solution {
    public String reverseWords(String s) {
        String st[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<st.length;i++){
            StringBuilder re=new StringBuilder(st[i]);
            sb.append(re.reverse());
            if(i!=st.length-1){
               sb.append(" "); 
            }
        }
        return sb.toString();
    }
}