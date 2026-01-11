class Solution {
    private static final int MOD = 1_000_000_007;

    public int numPrimeArrangements(int n) {
        int p = countPrimes(n);

        long result = 1;

        // compute p!
        for (int i = 2; i <= p; i++) {
            result = (result * i) % MOD;
        }

        // compute (n - p)!
        for (int i = 2; i <= n - p; i++) {
            result = (result * i) % MOD;
        }

        return (int) result;
    }

    private int countPrimes(int n) {
        if (n < 2) return 0;

        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }
}
