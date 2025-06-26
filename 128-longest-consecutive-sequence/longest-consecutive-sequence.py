class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        n=len(nums)
        nums.sort()
        if n==1:
            return 1
        if n==0:
            return 0
        c=1
        maxi=-1
        for i in range(n-1):
            if nums[i+1]-nums[i]==1:
                c+=1
            elif nums[i+1]-nums[i]==0:
                maxi=max(maxi,c)
                continue
            else:
                c=1
            maxi=max(maxi,c)
        return maxi