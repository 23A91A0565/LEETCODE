class Solution {
    public long maxAlternatingSum(int[] nums) {
        int len=nums.length;
        long ans=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums){
            pq.offer(Math.abs(num));
        }
        int c=0;
        while(!pq.isEmpty()){
            int curr=pq.poll();
            if(c<(len+1)/2){
                ans+=(1L*curr*curr);
            }
            else{
                ans-=(1L*curr*curr);
            }
            c++;
        }
        return ans;
    }
}