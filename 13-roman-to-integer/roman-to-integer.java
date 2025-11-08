class Solution {
    public int romanToInt(String s) {
        int n = s.length(), total = 0;

        for (int i = 0; i < n; i++) {
            int curr = val(s.charAt(i));
            int next = (i + 1 < n) ? val(s.charAt(i + 1)) : 0;

            if (curr < next) total -= curr;   // subtractive case
            else total += curr;               // normal case
        }
        return total;
    }

    private int val(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:  return 0; // input assumed valid per problem
        }
    }
}
