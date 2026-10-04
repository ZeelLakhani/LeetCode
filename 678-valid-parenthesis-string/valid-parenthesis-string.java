class Solution {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                low++;
                high++;
            } else if (c == ')') {
                low--;
                high--;
            } else { // '*'
                low--;   // '*' becomes ')'
                high++;  // '*' becomes '('
            }

            // Even in the best case, too many ')' appeared
            if (high < 0) {
                return false;
            }

            // low cannot be negative; '*' can act as '('
            low = Math.max(low, 0);
        }

        return low == 0;
    }
}
