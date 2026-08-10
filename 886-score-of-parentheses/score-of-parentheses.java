class Solution {
    public int scoreOfParentheses(String str) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(') {
                stack.push(-1); // Use -1 to represent an open bracket '('
            } else {
                // Case 1: Immediate "()" pair
                if (stack.peek() == -1) {
                    stack.pop();
                    stack.push(1);
                } 
                // Case 2: Nested "(A)" or multi-item "(A + B)"
                else {
                    int val = 0;
                    while (stack.peek() != -1) {
                        val += stack.pop();
                    }
                    stack.pop(); // Remove the matching -1 '('
                    stack.push(2 * val);
                }
            }
        }

        // Sum up all remaining scores at the outer level
        int totalScore = 0;
        while (!stack.isEmpty()) {
            totalScore += stack.pop();
        }

        return totalScore;
    }
}