class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int pre[] = new int[words.length];
        int ans[] = new int[queries.length];
        int p = 0;
        for (int i = 0; i < words.length; i++) {
            String w = words[i].toLowerCase();
            if ((w.startsWith("a") || w.startsWith("e") || w.startsWith("i") || w.startsWith("o") || w.startsWith("u"))
                && (w.endsWith("a") || w.endsWith("e") || w.endsWith("i") || w.endsWith("o") || w.endsWith("u"))) {
                p += 1;
            }
            pre[i] = p; 
        }

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            ans[i] = pre[e] - (s > 0 ? pre[s - 1] : 0);
        }
        return ans;
    }
}