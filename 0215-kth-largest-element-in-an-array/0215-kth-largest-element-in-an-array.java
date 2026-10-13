class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:nums){
            pq.offer(ele);
        }
        k=k-1;
        while(!pq.isEmpty() && k!=0){
            pq.poll();
            k--;
        }
        return pq.isEmpty()?-1:pq.peek();
    }
}