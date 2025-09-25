class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> m = new HashMap<>();
        return climbStairs(n, m);
    }
    private int climbStairs(int n, Map<Integer,Integer> m) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (!m.containsKey(n)) {
            m.put(n, climbStairs(n-1, m) + climbStairs(n-2, m));
        }
        return m.get(n);
    }
}