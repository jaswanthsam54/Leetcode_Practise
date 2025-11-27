class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--;  // shift to 0-25 instead of 1-26
            int remainder = columnNumber % 26;
            char letter = (char) ('A' + remainder);
            sb.append(letter);
            columnNumber /= 26;
        }
        
        return sb.reverse().toString(); // reverse to get final column title
    }
}
