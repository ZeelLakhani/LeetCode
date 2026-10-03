class Solution {
    public int longestValidParentheses(String s) {
        int max = 0;
        int open = 0;
        int close = 0;

        // Left to right
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else {
                close++;
            }

            if (open == close) {
                max = Math.max(max, 2 * close);
            } else if (close > open) {
                open = 0;
                close = 0;
            }
        }

        // Right to left
        open = 0;
        close = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c == '(') {
                open++;
            } else {
                close++;
            }

            if (open == close) {
                max = Math.max(max, 2 * open);
            } else if (open > close) {
                open = 0;
                close = 0;
            }
        }

        return max;
    }
}
