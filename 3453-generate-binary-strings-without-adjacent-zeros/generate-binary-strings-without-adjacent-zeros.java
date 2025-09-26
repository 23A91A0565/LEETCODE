class Solution {
    ArrayList<String> ans = new ArrayList<>();

    public List<String> validStrings(int n) {
        solve("", n);
        return ans;
    }

    public void solve(String s, int n) {
        if (s.length() == n) {
            ans.add(s);
            return; 
        }

        if (s.isEmpty()) {
            solve(s + '1', n);
            solve(s + '0', n);
        } else if (s.charAt(s.length() - 1) == '0') {
            solve(s + '1', n);
        } else {
            solve(s + '1', n);
            solve(s + '0', n);
        }
    }
}
