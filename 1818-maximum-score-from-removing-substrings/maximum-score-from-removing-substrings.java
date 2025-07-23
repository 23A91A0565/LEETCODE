class Solution {
    public int maximumGain(String s, int x, int y) {
         if (x > y) {
            return process(s, "ab", x, "ba", y);
        } else {
            return process(s, "ba", y, "ab", x);
        }
    }

    private int process(String s, String first, int firstValue, String second, int secondValue) {
        int total = 0;
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == first.charAt(0) && ch == first.charAt(1)) {
                stack.pop();
                total += firstValue;
            } else {
                stack.push(ch);
            }
        }

        StringBuilder remaining = new StringBuilder();
        while (!stack.isEmpty()) {
            remaining.append(stack.pop());
        }
        s = remaining.reverse().toString();
        stack.clear();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == second.charAt(0) && ch == second.charAt(1)) {
                stack.pop();
                total += secondValue;
            } else {
                stack.push(ch);
            }
        }

        return total;
    }
}