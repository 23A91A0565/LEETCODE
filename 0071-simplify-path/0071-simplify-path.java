class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        int n = path.length();
        int i = 1; 
        while (i < n) {
            StringBuilder sb = new StringBuilder();
            while (i < n && path.charAt(i) != '/') {
                sb.append(path.charAt(i));
                i++;
            }
            String dir = sb.toString();
            if (dir.equals("") || dir.equals(".")) {
                i++;
                continue;
            } 
            else if (dir.equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            } 
            else {
                s.push(dir);
            }
            i++;
        }

        if (s.isEmpty())
            return "/";

        StringBuilder res = new StringBuilder();
        for (String dir : s) {
            res.append("/").append(dir);
        }
        return res.toString();
    }
}