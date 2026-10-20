class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(num*9 < sum)return "";
        int nines=sum/9;
        int rem=sum%9;
        return ("9".repeat(nines)+rem+"0".repeat(num)).substring(0,num);
    }
}
