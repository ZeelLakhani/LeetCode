class Solution {
    public int minimumDeletions(int[] nums) {
        int min = 0, max = 0;
        int start = 0 , end = nums.length - 1;
        int del = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] > nums[max]) max = i;
            if (nums[i] < nums[min]) min = i;
        }

        int first = Math.min(max, min);
        if(first != min) {
            int temp = min;
            min = max;
            max = temp;
        }

        if ((min - start) < (end - max)) {
            del = min - start + 1;
            start = min + 1;
            if ((max - start) < (end - max)) del += max - start + 1;
            else del += end - max + 1;
        } else {
            del = end - max + 1;
            end = max - 1;
            if ((min - start) < (end - min)) del += min - start + 1;
            else del += end - min + 1;
        }
        return del;
    }
}