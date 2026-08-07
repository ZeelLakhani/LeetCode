class Solution {
    public int largestInteger(int n, int s) {
        if (s > n * 9) return -1;
        if (s == 0) return 0;

        String num = "";
        for (int i=0; i<n; i++) {
            if (s >= 9) {
                num += "9";
                s -= 9;
            }
            else {
                num += s;
                s = 0;
            }
        }

        return Integer.parseInt(num);
    }
}