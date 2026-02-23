class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(s.length()<k)return false;
        HashSet<String> ans=new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
            String res=s.substring(i,i+k);
            ans.add(res);
        }
        return ans.size()==Math.pow(2,k);
    }
}