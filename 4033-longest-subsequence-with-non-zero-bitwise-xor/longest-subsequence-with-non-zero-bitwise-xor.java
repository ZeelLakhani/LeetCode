class Solution {
    public int longestSubsequence(int[] nums) {
        int ans = 0;
        int zeroCount = 0;

        for (int n : nums) {
            ans ^= n;
            if (n == 0) zeroCount++;
        }
        if (ans != 0) return nums.length;
        else if (zeroCount == nums.length) return 0;
        else return nums.length - 1;
    }
}