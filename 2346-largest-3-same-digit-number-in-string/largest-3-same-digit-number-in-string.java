class Solution {
    public String largestGoodInteger(String num) {
        char maxChar = 0; 
        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) &&
                num.charAt(i + 1) == num.charAt(i + 2) &&
                num.charAt(i) > maxChar) {
                maxChar = num.charAt(i);
            }
        }

        if (maxChar == 0) {
            return ""; 
        }

        return "" + maxChar + maxChar + maxChar;
    }
}