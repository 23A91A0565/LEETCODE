class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        arr=[]
        for arr in matrix:
            for i in arr:
                if i==target:
                    return True
                    break
        return False
        