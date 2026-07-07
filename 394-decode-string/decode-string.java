import java.util.Stack;

class Solution {

    public String decodeString(String s) {

        // Stores numbers like 2, 3, 10...
        Stack<Integer> numStack = new Stack<>();

        // Stores characters, strings and '['
        Stack<String> stringStack = new Stack<>();

        // Current number being formed
        int k = 0;

        // Read one character at a time
        for (char c : s.toCharArray()) {

            // If it is a digit
            if (Character.isDigit(c)) {

                // Build multi-digit number
                // Example:
                // Read '1' -> k = 1
                // Read '2' -> k = 12
                k = (k * 10) + (c - '0');
                continue;
            }

            // If opening bracket
            if (c == '[') {

                // Save the repeat count
                numStack.push(k);

                // Reset for next number
                k = 0;

                // Mark beginning of this block
                stringStack.push("[");

                continue;
            }

            // Normal alphabet
            if (c != ']') {

                // Push character into stack
                stringStack.push(String.valueOf(c));

                continue;
            }

            // -----------------------------
            // We reached ']'
            // Decode one complete block
            // -----------------------------

            // Stores the substring inside []
            StringBuilder temp = new StringBuilder();

            // Pop until '[' is found
            while (!stringStack.peek().equals("[")) {

                // Insert at front because stack pops in reverse order
                temp.insert(0, stringStack.pop());
            }

            // Remove '['
            stringStack.pop();

            // Number of repetitions
            int count = numStack.pop();

            // Build repeated string
            StringBuilder replacement = new StringBuilder();

            for (int i = 0; i < count; i++) {
                replacement.append(temp);
            }

            // Push decoded string back
            stringStack.push(replacement.toString());
        }

        // Build final answer
        StringBuilder result = new StringBuilder();

        while (!stringStack.isEmpty()) {

            // Again insert at front because stack is LIFO
            result.insert(0, stringStack.pop());
        }

        return result.toString();
    }
}