class Solution {
    public int maxDigitRange(int[] nums) {
        int[] diff = new int[nums.length];
        int range = 0;

        for (int i=0;i<nums.length;i++) {
            String num = String.valueOf(nums[i]);
            int max = num.charAt(0) - '0';
            int min = num.charAt(0) - '0';

            for (int j=0;j<num.length();j++) {
                int n = num.charAt(j) - '0';
                max = Math.max(max , n);
                min = Math.min(min , n);
            }

            diff[i] = max - min; 
            range = Math.max(range , diff[i]);
        }

        int sum = 0;

        for (int i=0;i<diff.length;i++) {
            if (range == diff[i]) {
                sum += nums[i];
            }
        }
        return sum;
    }
}