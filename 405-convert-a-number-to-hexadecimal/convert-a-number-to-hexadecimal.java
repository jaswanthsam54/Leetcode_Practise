class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        
        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        
        // At most 8 hex digits for 32-bit int
        while (num != 0 && sb.length() < 8) {
            int digit = num & 0xf;            // last 4 bits
            sb.append(hexChars[digit]);
            num >>>= 4;                       // unsigned right shift
        }
        
        return sb.reverse().toString();
    }
}
