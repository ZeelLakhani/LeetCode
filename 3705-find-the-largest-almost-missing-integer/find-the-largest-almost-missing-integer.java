class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] count = new int[51];
        int len = nums.length;
        int max = -1;

        for (int n : nums) count[n]++;

        if (k == 1) {
            for (int i=50; i>=0; i--) if (count[i] == 1) return i;
            return -1;
        }

        if (len == k) {
            for (int n : nums) if (n > max) max = n;
            return max;
        }

        // For 1 < k < n, only the first and last positions
        // belong to exactly one subarray.
        if (count[nums[0]] == 1) max = Math.max(max, nums[0]);
        if (count[nums[len - 1]] == 1) max = Math.max(max, nums[len - 1]);
        return max;
    }
}