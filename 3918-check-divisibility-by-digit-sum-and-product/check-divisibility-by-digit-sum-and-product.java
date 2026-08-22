class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, product = 1;
        int num = n;

        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            sum += digit;
            product *= digit;
        }

        return n % (sum + product) == 0;
    }
}