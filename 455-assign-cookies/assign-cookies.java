class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n=s.length;
        int j=0;
        for(int i=0;i<n && j<g.length;i++){
            if(g[j]<=s[i])j++;
        }
        return j;
    }
}