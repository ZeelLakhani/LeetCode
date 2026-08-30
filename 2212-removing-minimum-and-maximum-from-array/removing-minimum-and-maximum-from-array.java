class Solution {
    public int minimumDeletions(int[] nums) {
        int min = 0, max = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] > nums[max]) max = i;
            if (nums[i] < nums[min]) min = i;
        }

        int a = Math.min(min, max);
        int b = Math.max(min, max);
        int front = b + 1;
        int back = nums.length - a;
        int both = (a + 1) + (nums.length - b);

        return Math.min(both, Math.min(front, back));
    }
}