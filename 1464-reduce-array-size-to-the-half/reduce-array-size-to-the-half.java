class Solution {
    public int minSetSize(int[] arr) {
        int[] count = new int[100001];
        for(int a : arr) {
            count[a]++;
        }
        
        Arrays.sort(count);
        
        int n = arr.length;
        int sum = 0;
        int i = 0;
        for(i = count.length - 1; i>=0; i--) {
            sum += count[i];
            if(sum >= n/2)
                break;
        }
        
        return count.length - i;
    }
}