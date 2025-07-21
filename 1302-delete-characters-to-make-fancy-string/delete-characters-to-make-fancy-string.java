class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        int c=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i-1)==s.charAt(i)){
                c+=1;
            }
            else{
                c=1;
            }
            if(c<3)
            {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}