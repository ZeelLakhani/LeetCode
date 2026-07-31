class Solution {
    public int minimumPushes(String word) {
        int[] count = new int[26];
        
        for (char ch : word.toCharArray()) count[ch - 'a']++;

        int sum = 0 , ch = 0; 
        Arrays.sort(count);

        for (int i=25; i>=0; i--) {
            if (count[i] == 0) break;
            sum += (count[i] * (ch / 8 + 1));
            ch++;
        }
        return sum;
    }
}