class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] pre = new int[n + 1]; 
        int[] suff = new int[n + 1]; 
        for (int i = 0, p = 0; i < n; i++) {
            pre[i] = p;
            if (customers.charAt(i) == 'N') p++;
        }
        pre[n] = pre[n - 1] + (customers.charAt(n - 1) == 'N' ? 1 : 0);
        for (int i = n - 1, s = 0; i >= 0; i--) {
            if (customers.charAt(i) == 'Y') s++;
            suff[i] = s;
        }
        suff[n] = 0; 
        int min = Integer.MAX_VALUE, index = 0;
        for (int i = 0; i <= n; i++) {
            int val = pre[i] + suff[i];
            if (val < min) {
                min = val;
                index = i;
            }
        }
        return index;
    }
}