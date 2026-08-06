class Solution {
    public static int product(int n) {
        int product = 1;
        do {
            product *= n % 10;
            n /= 10;
        } while (n > 0);
        return product;
    }

    public int smallestNumber(int n, int t) {
        while (product(n) % t != 0) n++;
        return n;
    }
}