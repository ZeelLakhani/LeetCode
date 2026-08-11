class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        List<Integer> list = new ArrayList<>();

        for (int i=1; i<nums.length; i++) {
            if (nums[i] != nums[i-1] + 1) break;
            sum += nums[i];
        }

        for (int n : nums) list.add(n);
        
        while (list.contains(sum)) sum++;
        return sum;
    }
}