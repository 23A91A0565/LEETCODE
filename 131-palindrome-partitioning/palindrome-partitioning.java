class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        func(0,s,temp,res);
        return res;
    }
    private void func(int idx,String s,List<String> temp,List<List<String>> res) {
        if(idx==s.length()) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx; i<s.length(); i++) {
            if(isPalindrome(s, idx, i)) {
                temp.add(s.substring(idx, i+1));
                func(i+1, s, temp, res);
                temp.remove(temp.size()-1);
            }
        }
    }
    private boolean isPalindrome(String s, int start, int end) {
        while(start <= end) {
            if(s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
} 