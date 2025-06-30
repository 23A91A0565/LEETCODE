class Solution {
    public double averageWaitingTime(int[][] customers) {
        int availableAt = 0;
        double totalWait = 0;
        for (int[] customer : customers) {
            int arrival = customer[0];
            int t = customer[1];
            availableAt = Math.max(availableAt, arrival) + t;
            totalWait += availableAt - arrival;
        }
        return totalWait / customers.length;
    
    }
}