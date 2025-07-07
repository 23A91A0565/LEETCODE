class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        int count = 0, i=0, n=events.length, day=1, maxday=0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for( int [] j : events){
            maxday = Math.max(maxday,j[1]);
        }
        while(day<=maxday){
            while(i<n && events[i][0]==day){
                minHeap.offer(events[i][1]);
                i++;
            }
            while(!minHeap.isEmpty() && minHeap.peek() < day ){
                minHeap.poll();
            }
            if(!minHeap.isEmpty()){
                minHeap.poll();
                count++;
            }
            day++;
        }
        return count;
    }
}