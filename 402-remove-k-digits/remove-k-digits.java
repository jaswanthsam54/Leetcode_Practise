class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char digit : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peekLast() > digit) {
                stack.pollLast();
                k--;
            }
            stack.offerLast(digit);
        }
        
        // Leftover budget: remove from the end (least significant digits)
        while (k > 0 && !stack.isEmpty()) {
            stack.pollLast();
            k--;
        }
        
        // Build result, stripping leading zeros
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for (char c : stack) {
            if (leadingZero && c == '0') continue;
            leadingZero = false;
            sb.append(c);
        }
        
        return sb.length() == 0 ? "0" : sb.toString();
    }
}