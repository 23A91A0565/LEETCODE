class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->{
            if(a[1]!=b[1]){
                return a[1]-b[1];
            }
            else{
                return a[0]-b[0];
            }
        });
        for(int i=0;i<n;i++){
            int ele=arr[i];
            int count=Integer.bitCount(ele);
            q.offer(new int[]{ele,count});
        }
        for(int i=0;i<n;i++){
            int a[]=q.poll();
            arr[i]=a[0];
        }
        return arr;
    }
}