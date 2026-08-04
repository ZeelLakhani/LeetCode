class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int min = nums[0], max = nums[0];

        for (int n : nums) {
            if (n > max) max = n;
            else if (n < min) min = n;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        for (int i=min; i<=max; i++) {
            if (!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}