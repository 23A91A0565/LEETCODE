class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length()){
            return false;
        }
        return solve(s1,s2,s3,s1.length()-1,s2.length()-1,s3.length()-1);
    }
    public boolean solve(String s1,String s2,String s3,int n1,int n2,int n3){
        if(n1<0 && n2<0 && n3<0){
            return true;
        }
        if(n1>=0 && n3>=0 && s1.charAt(n1)==s3.charAt(n3) && n2>=0 && s2.charAt(n2)==s3.charAt(n3)){
            return solve(s1,s2,s3,n1-1,n2,n3-1) || solve(s1,s2,s3,n1,n2-1,n3-1);
        }
        else if(n1>=0 && n3>=0 && s1.charAt(n1)==s3.charAt(n3)){
            return solve(s1,s2,s3,n1-1,n2,n3-1);
        }
        else if(n2>=0 && n3>=0 && s2.charAt(n2)==s3.charAt(n3)){
            return solve(s1,s2,s3,n1,n2-1,n3-1);
        }
        return false;
    }
}