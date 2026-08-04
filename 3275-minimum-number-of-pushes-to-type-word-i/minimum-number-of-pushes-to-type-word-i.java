class Solution {
    public int minimumPushes(String word) {
        int[] count = new int[26];

        for (char c : word.toCharArray()) count[c - 'a']++;

        int push = 0;
        int ch = 0;

        for (int i=0; i<26; i++) {
            if (count[i] > 0) {
                push += (count[i] * (ch / 8 + 1));
                ch++;
            }
        }
        return push;
    }
}