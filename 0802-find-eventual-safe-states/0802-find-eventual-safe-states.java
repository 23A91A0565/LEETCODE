class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=graph.length;
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
        }

        int outdeg[]=new int[n];
        for(int i=0;i<n;i++){
            for(int ele:graph[i]){
                outdeg[i]++;
                ans.get(ele).add(i);
            }
        }

        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> res=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(outdeg[i]==0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int node=q.poll();
            res.add(node);
            for(int ele:ans.get(node)){
                outdeg[ele]--;
                if(outdeg[ele]==0){
                    q.offer(ele);
                }
            }
        }

        Collections.sort(res);
        return res;
    }
}