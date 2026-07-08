class Solution {
    static final int MOD = 1_000_000_007;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();

        // first non-zero index at or after i
        int[] next = new int[n];
        int last = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) != '0') last = i;
            next[i] = last;
        }

        // last non-zero index at or before i
        int[] prev = new int[n];
        last = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '0') last = i;
            prev[i] = last;
        }

        // compressed non-zero digits
        ArrayList<Integer> digits = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '0') {
                map.put(i, digits.size());
                digits.add(s.charAt(i) - '0');
            }
        }

        int m = digits.size();

        long[] prefixSum = new long[m + 1];
        long[] prefixNum = new long[m + 1];
        long[] pow10 = new long[m + 1];

        pow10[0] = 1;
        for (int i = 1; i <= m; i++)
            pow10[i] = (pow10[i - 1] * 10) % MOD;

        for (int i = 0; i < m; i++) {
            prefixSum[i + 1] = prefixSum[i] + digits.get(i);
            prefixNum[i + 1] =
                    (prefixNum[i] * 10 + digits.get(i)) % MOD;
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int l = queries[i][0];
            int r = queries[i][1];

            int leftPos = next[l];
            int rightPos = prev[r];

            if (leftPos == -1 || rightPos == -1 || leftPos > rightPos) {
                ans[i] = 0;
                continue;
            }

            int L = map.get(leftPos);
            int R = map.get(rightPos);

            long sum = prefixSum[R + 1] - prefixSum[L];

            int len = R - L + 1;

            long number = (prefixNum[R + 1]
                    - (prefixNum[L] * pow10[len]) % MOD + MOD) % MOD;

            ans[i] = (int) ((number * (sum % MOD)) % MOD);
        }

        return ans;
    }
}