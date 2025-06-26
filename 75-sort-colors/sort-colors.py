class Solution:
    def sortColors(self, arr: List[int]) -> None:
        for n in range(len(arr) - 1, 0, -1):
            for i in range(n):
                if arr[i] > arr[i + 1]:
                    arr[i], arr[i + 1] = arr[i + 1], arr[i]
        