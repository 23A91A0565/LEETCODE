class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            ans.add(new ArrayList<>());
        }

        int before[]=new int[numCourses];
        for(int ele[]:prerequisites){
            int a=ele[0];
            int b=ele[1];
            ans.get(b).add(a);
            before[a]++;
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(before[i]==0){
                q.offer(i);
            }
        }

        int result[]=new int[numCourses];
        int ind=0;

        while(!q.isEmpty()){
            int node=q.poll();
            result[ind++]=node;
            for(int ele:ans.get(node)){
                before[ele]--;
                if(before[ele]==0){
                    q.offer(ele);
                }
            }
        }

        if(ind==numCourses){
            return result;
        }
        return new int[0];
    }
}