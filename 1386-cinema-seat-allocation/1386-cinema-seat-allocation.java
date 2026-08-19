class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
       HashMap<Integer,Set<Integer>> map=new HashMap<>();
       int ans=0;
       for(int ele[]:reservedSeats){
        if(!map.containsKey(ele[0]))map.put(ele[0],new HashSet<>());
        map.get(ele[0]).add(ele[1]);
       }
       int rem_rows=(n-map.size())*2;
       ans+=rem_rows;
       for(Set<Integer> s:map.values()){
        boolean left=(!s.contains(2) && !s.contains(3) && !s.contains(4) && !s.contains(5));
        boolean mid=(!s.contains(4) && !s.contains(5) && !s.contains(6) && !s.contains(7));
        boolean right=(!s.contains(6) && !s.contains(7) && !s.contains(8) && !s.contains(9));

        if(left && right){
            ans+=2;
        }
        else if(left || mid || right){
            ans+=1;
        }
       }
       return ans;
    }
}