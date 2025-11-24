class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, maxLen = 0;
        int[] lastIndex = new int[128];   // ASCII characters
        Arrays.fill(lastIndex, -1);

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);

            if (lastIndex[c] >= left) {
                // Character repeated inside window
                left = lastIndex[c] + 1;
            }

            lastIndex[c] = right; // Update last seen index
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
