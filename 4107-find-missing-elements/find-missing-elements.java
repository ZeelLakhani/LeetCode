class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int min = nums[0], max = nums[0];

        for (int n : nums) {
            if (n > max) max = n;
            else if (n < min) min = n;
        }

        int[] arr = new int[max + 1];
        for (int n : nums) arr[n]++;

        for (int i=min; i<=max; i++) {
            if (arr[i] == 0) ans.add(i);
        }
        return ans;
    }
}