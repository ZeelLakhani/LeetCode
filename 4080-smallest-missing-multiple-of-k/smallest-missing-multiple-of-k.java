class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int n : nums) set.add(n);

        int multiple = k;

        while (set.contains(multiple)) multiple += k;

        return multiple;
        
        // List<Integer> list = new ArrayList<>();
        // for (int i=1; i<=nums.length; i++) {
        //     list.add(i);
        // }

        // for (int n : nums) {
        //     if (n % k == 0) list.remove(Integer.valueOf(n/k));
        // }
        // if (list.size() == 0) return k * (nums.length + 1);
        // return k * list.get(0);
    }
}