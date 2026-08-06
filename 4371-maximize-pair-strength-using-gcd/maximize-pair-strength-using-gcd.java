class Solution {
    public static long gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public long maxPairStrength(int[] nums) {
        long ans = 0;

        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                long val = (long) nums[i] * nums[j];
                long g = gcd(nums[i], nums[j]);
                ans = Math.max(ans , val / (g * g));
            }
        }

        return ans;
    }
}