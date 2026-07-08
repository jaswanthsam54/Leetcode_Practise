class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequencies
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        while (!map.isEmpty()) {

            char maxChar = ' ';
            int maxFreq = 0;

            // Find character with maximum frequency
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {

                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    maxChar = entry.getKey();
                }
            }

            // Append maxChar maxFreq times
            while (maxFreq-- > 0) {
                sb.append(maxChar);
            }

            // Remove that character
            map.remove(maxChar);
        }

        return sb.toString();
    }
}