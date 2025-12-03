// O(1) time, O(1) space
import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;
        return num == 6 || num == 28 || num == 496 || num == 8128 || num == 33550336;
    }
}
