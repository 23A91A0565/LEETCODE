class Solution {
    public boolean hasSameDigits(String s) {
        String rep="";
        for(int i=0;i<s.length()-1;i++){
            int num=(s.charAt(i)-'0'+s.charAt(i+1)-'0')%10;
            rep+=String.valueOf(num);
        }
        if(rep.length()>2){
            return hasSameDigits(rep);
        }
        return rep.charAt(0)==rep.charAt(1); 
    }
}