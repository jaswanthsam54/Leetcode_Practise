class Solution {
    public boolean isPalindrome(int x) {
         if (x < 0) return false;
    // Step 2: Find reverse
    int original = x;
    int reverse = 0;
    while (x != 0) {
        int digit = x % 10;
        reverse = reverse * 10 + digit;
        x /= 10;
    }
    // Step 3: Check if original equals reverse
    return original == reverse;
    }
}
