class Solution {
    public long sumAndMultiply(int n) {
        if (n == 0) return 0;
        String num = String.valueOf(n);
        String x = "";
        long sum = 0;

        for (int i=0;i<num.length();i++) {
            if (num.charAt(i) != '0') {
                x += num.charAt(i);
                sum += num.charAt(i) - '0';
            }
        }
        long val = Long.parseLong(x);
        return val * sum;
    }
}