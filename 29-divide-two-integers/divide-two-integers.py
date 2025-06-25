class Solution:
    def divide(self, n: int, m: int) -> int:
        d=int(n/m)
        if d>=-2147483648 and d<=2147483647:
            return d
        elif d<-2147483648:
            return 2147483648
        else:
            return 2147483647
      
  
        