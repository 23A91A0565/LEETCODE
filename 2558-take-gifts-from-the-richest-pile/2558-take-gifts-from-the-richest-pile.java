class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:gifts){
            pq.offer(ele);
        }
        while(!pq.isEmpty() && k-->0){
            int curr=pq.poll();
            pq.add((int)Math.sqrt(curr));
        }
        long sum=0;
        while(!pq.isEmpty()){
            sum+=pq.peek();
            pq.poll();
        }
        return sum;
    }
}