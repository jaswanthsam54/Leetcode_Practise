class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] result = new int[spells.length];
        for (int i = 0 ; i < spells.length ; i++) {
            int lo = 0;
            int hi = potions.length;
            while (lo < hi) {
                int mid = lo + (hi - lo) / 2;
                long check = (success + spells[i] - 1) / spells[i];
                if (potions[mid] < check) {
                    lo = mid + 1;
                }
                else {
                    hi = mid;
                }
            }
            result[i] = potions.length - lo;
        }   
        return result;
    }
}