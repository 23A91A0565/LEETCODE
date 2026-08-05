class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
        }
        for(int ele[]:invocations){
            int a=ele[0];
            int b=ele[1];
            ans.get(a).add(b);
        }

        boolean check[]=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        check[k]=true;
        q.offer(k);

        // Bfs to mark all nodes as visited from k node
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int ele:ans.get(curr)){
                if(!check[ele]){
                    check[ele]=true;
                    q.offer(ele);
                }
            }
        }

        for(int ele[]:invocations){
            int a=ele[0];
            int b=ele[1];
            // checking wheather is there any incoming edge
            if(!check[a] && check[b]){
                ArrayList<Integer> l=new ArrayList<>();
                for(int i=0;i<n;i++){
                    l.add(i);
                }
                return l;
            }
        }

        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!check[i]){
                res.add(i);
            }
        }
        return res;
    }
}