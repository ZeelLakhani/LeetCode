class Solution {
    public static void helper(int open, int close, String s, List<String> ans) {
        if (open == 0 && close == 0) {
            ans.add(s);
            return;
        }

        if (open > 0) helper(open - 1, close, s + "(", ans);
        if (close > open) helper(open, close - 1, s + ")", ans);
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n, n, "", ans);

        return ans;
    }
}