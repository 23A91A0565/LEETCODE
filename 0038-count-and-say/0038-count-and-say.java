class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=1;i<n;i++){
            StringBuilder sb=new StringBuilder();
            int c=1;
            for(int j=1;j<s.length();j++){
                if(s.charAt(j)==s.charAt(j-1)){
                    c+=1;
                }
                else{
                    sb.append(c).append(s.charAt(j-1));
                    c=1;
                }
            }
            sb.append(c).append(s.charAt(s.length()-1));
            s=sb.toString();
        }
        return s;
    }
}