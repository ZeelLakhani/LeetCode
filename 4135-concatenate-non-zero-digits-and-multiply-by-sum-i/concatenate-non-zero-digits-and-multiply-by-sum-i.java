class Solution {
    public long sumAndMultiply(int n) {
        if (n == 0) return 0;

        String num = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        long sum = 0;

        for (char c : num.toCharArray()) {
            if (c != '0') {
                sb.append(c);
                sum += c - '0';
            }
        }
        long val = Long.parseLong(sb.toString());
        return val * sum;
    }
}