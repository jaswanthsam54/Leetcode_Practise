class Solution {
    public String countAndSay(int n) {
        // Base case
        if (n <= 0) return "";
        
        String result = "1";
        
        // Iteratively generate the sequence up to n
        for (int i = 1; i < n; i++) {
            StringBuilder current = new StringBuilder();
            int len = result.length();
            
            int j = 0;
            while (j < len) {
                char ch = result.charAt(j);
                int count = 0;
                
                // Count consecutive occurrences of the current character
                while (j < len && result.charAt(j) == ch) {
                    count++;
                    j++;
                }
                
                // Append the frequency followed by the character
                current.append(count).append(ch);
            }
            
            // Move to the next sequence item
            result = current.toString();
        }
        
        return result;
    }
}