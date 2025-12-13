class Solution {
    public int findTheLongestSubstring(String s) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        ans.put(0,-1);
        int max=0,mask=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(c=='a')mask^=1<<0;
            else if(c=='e')mask^=1<<1; // for adding the 1 in 0's place
            else if(c=='i')mask^=1<<2; // for adding the 1 in 1's place
            else if(c=='o')mask^=1<<3;
            else if(c=='u')mask^=1<<4;
            
            // For Example
            // String: "aea"
            // Start: mask = 00000

            // Read 'a':
            // mask ^= 00001 → 00001 (a is odd)

            // Read 'e':
            // mask ^= 00010 → 00011 (a odd, e odd)

            // Read 'a' again:
            // mask ^= 00001 → 00010 (a even, e odd) 

            if(ans.containsKey(mask)){
                max=Math.max(max,i-ans.get(mask));
            }
            else{
                ans.put(mask,i);
            }
        }
        return max;
    }
}