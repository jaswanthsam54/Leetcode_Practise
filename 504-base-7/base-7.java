// LeetCode 504: Base 7 - optimized Java solution
public class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";

        boolean neg = num < 0;
        long n = num;                // use long to safely handle Integer.MIN_VALUE
        if (n < 0) n = -n;

        // max length: sign + digits.
        // 32-bit integer in base 7 needs at most 11 digits (7^11 > 2^31)
        char[] buf = new char[12];   // safe upper bound
        int idx = buf.length;

        while (n > 0) {
            int digit = (int)(n % 7);
            buf[--idx] = (char)('0' + digit);
            n /= 7;
        }

        if (neg) buf[--idx] = '-';

        return new String(buf, idx, buf.length - idx);
    }
}
