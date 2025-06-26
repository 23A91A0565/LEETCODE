class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        number=""
        for i in digits:
            number+=str(i)
        intnum=int(number)
        intnum=intnum+1
        output=[]
        for i in str(intnum):
            output.append(int(i))
        return output