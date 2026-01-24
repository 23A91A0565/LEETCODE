class Solution {
    public int numSplits(String s) {
        HashSet<Character> ans=new HashSet<>();
        int total=0;
        int left[]=new int[s.length()];
        int right[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(!ans.contains(s.charAt(i))){
                total+=1;
            }
            left[i]=total;
            ans.add(s.charAt(i));
        }

        ans.clear();
        total=0;

        for(int i=s.length()-1;i>=0;i--){
            right[i]=total;
            if(!ans.contains(s.charAt(i))){
                total+=1;
            }
            ans.add(s.charAt(i));
        }
        int res=0;
        for(int i=0;i<s.length();i++){
            if(left[i]==right[i]){
                res+=1;
            }
        }
        return res;
    }
}