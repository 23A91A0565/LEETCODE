class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        less = prices[0]
        for i in range(len(prices)):
            if prices[i]<less:
                less = prices[i]
            curr = prices[i] - less
            if curr > profit:
                profit = curr
        return profit
        