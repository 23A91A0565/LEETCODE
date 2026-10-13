class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:stones){
            pq.offer(ele);
        }
        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
            if(x==y){
                continue;
            }
            else{
                pq.offer(x-y);
            }
        }
        return pq.isEmpty()?0:pq.peek();
    }
}