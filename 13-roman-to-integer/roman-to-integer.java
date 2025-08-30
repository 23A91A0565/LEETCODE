class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> ans=new HashMap<>();
        ans.put('I',1);
        ans.put('V',5);
        ans.put('X',10);
        ans.put('L',50);
        ans.put('C',100);
        ans.put('D',500);
        ans.put('M',1000);
        int res=0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (ans.get(s.charAt(i)) < ans.get(s.charAt(i + 1))) {
                res -= ans.get(s.charAt(i));
            } else {
                res += ans.get(s.charAt(i));
            }
        }
        return res + ans.get(s.charAt(s.length() - 1));
    }
}