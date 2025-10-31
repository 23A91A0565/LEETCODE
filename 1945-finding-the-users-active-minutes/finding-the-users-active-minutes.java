class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,HashSet<Integer>> ans=new HashMap<>();
        int res[]=new int[k];
        for(int i=0;i<logs.length;i++){
            int id=logs[i][0];
            int time=logs[i][1];
            ans.putIfAbsent(id, new HashSet<>());
            ans.get(id).add(time);
        }
        for(int ele:ans.keySet()){
            int cou=ans.get(ele).size();
            res[cou-1]++;
        }
        return res;
    }
}