class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        // PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        // for(int i=0;i<nums1.length;i++){
        //     int diff=Math.abs(nums1[i]-nums2[i]);
        //     pq.add(new int[]{diff,i});
        // }
        // int rem=k1+k2;;
        // while(rem>0 && !pq.isEmpty()){
        //     int curr[]=pq.poll();
        //     if(curr[0]==0){
        //         continue;
        //     }
        //     else{
        //         pq.add(new int[]{curr[0]-1,curr[1]});
        //         rem--;
        //     }
        // }
        // long ans=0;
        // while(!pq.isEmpty()){
        //     int ele[]=pq.poll();
        //     ans+=(long)ele[0]*ele[0];
        // }
        // return ans;

        int n = nums1.length;
        int[] freq = new int[100001];
        long operations = (long) k1 + k2;
        long totalDiff = 0;

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            freq[diff]++;
            totalDiff += diff;
        }
        if (operations >= totalDiff) {
            return 0;
        }
        for (int d = 100000; d > 0 && operations > 0; d--) {
            if (freq[d] == 0) {
                continue;
            }
            long move = Math.min(operations, (long) freq[d]);

            freq[d] -= (int) move;
            freq[d - 1] += (int) move;
            operations -= move;
        }
        long ans = 0;
        for (int d = 1; d <= 100000; d++) {
            ans += (long) d * d * freq[d];
        }

        return ans;
    }
}