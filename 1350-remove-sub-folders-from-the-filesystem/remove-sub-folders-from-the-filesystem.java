class Solution {
    public List<String> removeSubfolders(String[] folder) {
       Arrays.sort(folder);  
        List<String> ans = new ArrayList<>();

        for (String f : folder) {
            if (ans.isEmpty() || !f.startsWith(ans.get(ans.size() - 1) + "/")) {
                ans.add(f); 
            }
        }

        return ans;
    }
}