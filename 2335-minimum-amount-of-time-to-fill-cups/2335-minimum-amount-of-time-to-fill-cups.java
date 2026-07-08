class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int res=0;
        for(int i=0;i<amount.length;i++){
            pq.offer(amount[i]);
        }
        while(!pq.isEmpty() && pq.peek()>0){
            int f=pq.poll();
            int s = pq.isEmpty() ? 0 : pq.poll();
            if(f-1>0){
               pq.offer(f-1); 
            }
            if(s-1>0){
                pq.offer(s-1);
            }
            res++;
        }
        return res;
    }
}