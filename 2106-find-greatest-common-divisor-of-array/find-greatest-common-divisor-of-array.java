class Solution {
    public int findGCD(int[] nums) {
        int max = 0 , min = nums[0];

        for (int n : nums) {
            if (n > max) max = n;
            else if (n < min) min = n;
        }

        for (int i=min; i>=1; i--) {
            if (max % i == 0 && min % i == 0) return i;
        }

        return 0;
    }
}