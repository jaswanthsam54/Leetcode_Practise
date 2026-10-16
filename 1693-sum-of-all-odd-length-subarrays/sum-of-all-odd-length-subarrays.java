class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for (int len = 1; len <= n; len += 2) {
            for (int i = 0; i + len <= n; i++) {
                int subSum = 0;

                for (int j = i; j < i + len; j++) {
                    subSum += arr[j];
                }

                sum += subSum;
            }
        }

        return sum;
    }
}