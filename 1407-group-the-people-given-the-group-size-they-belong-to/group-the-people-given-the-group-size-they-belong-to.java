class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        ArrayList<List<Integer>> ans=new ArrayList<>();
        HashMap<Integer,List<Integer>> group=new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
            int size=groupSizes[i];
            group.putIfAbsent(size,new ArrayList<>());
            group.get(size).add(i);
            if(group.get(size).size()==size){
                ans.add(group.get(size));
                group.remove(size);
            }
        }
        return ans;
    }
}