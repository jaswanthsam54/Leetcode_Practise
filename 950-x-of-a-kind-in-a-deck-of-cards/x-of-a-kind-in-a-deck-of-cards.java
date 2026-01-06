import java.util.*;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck == null || deck.length < 2) return false;

        Map<Integer, Integer> freq = new HashMap<>();
        for (int card : deck) {
            freq.put(card, freq.getOrDefault(card, 0) + 1);
        }

        int gcdValue = 0;
        for (int count : freq.values()) {
            gcdValue = gcd(gcdValue, count);
            if (gcdValue == 1) return false; // early exit
        }

        return gcdValue >= 2;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
