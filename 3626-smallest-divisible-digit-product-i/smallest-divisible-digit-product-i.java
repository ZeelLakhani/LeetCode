class Solution {
    public static int valid(int n) {
        int product = 1;
        while (n > 0) {
            int num = n % 10;
            n /= 10;
            product *= num;
        }
        return product;
    }

    public int smallestNumber(int n, int t) {
        while (valid(n) % t != 0) {
            n++;
        }
        return n;
    }
}