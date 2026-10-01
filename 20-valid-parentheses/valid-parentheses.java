class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == ')' || ch == '}' || ch ==']') {
                if (stack.size() > 0) {
                    if (stack.peek() == '(' && ch == ')') stack.pop();
                    else if (stack.peek() == '{' && ch == '}') stack.pop();
                    else if (stack.peek() == '[' && ch == ']') stack.pop();
                    else return false;
                } else return false;
            } else stack.push(ch);
        }
        return stack.size() == 0;
    }
}