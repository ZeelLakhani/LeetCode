class Solution {
    public int maximumLengthSubstring(String s) {
        int[] count = new int[26];
        int maxlen = 0, i = 0;
        
        for (int j=0; j<s.length(); j++) {
            char ch = s.charAt(j);
            count[ch - 'a']++;
            
            while (count[ch - 'a'] > 2) {
                count[s.charAt(i) - 'a']--;
                i++;
            }
            maxlen = Math.max(maxlen, j - i + 1);
        }
        return maxlen;
    }
}