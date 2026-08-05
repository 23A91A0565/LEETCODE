class Solution {
    public String minWindow(String s, String t) {
        int freq[]=new int[128];
        int count=t.length();
        int ans=Integer.MAX_VALUE;
        int st=0;
        for(char c:t.toCharArray()){
            freq[c]++;
        }
        int left=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(freq[c]>0){
                count--;
            }
            freq[c]--;
            while(count==0){
                if(right-left+1<ans){
                    ans=right-left+1;
                    st=left;
                }
                char leftC=s.charAt(left);
                freq[leftC]++;
                if(freq[leftC]>0){
                    count++;
                }
                left++;
            }
        }
        return ans==Integer.MAX_VALUE?"":s.substring(st,st+ans);
    }
}