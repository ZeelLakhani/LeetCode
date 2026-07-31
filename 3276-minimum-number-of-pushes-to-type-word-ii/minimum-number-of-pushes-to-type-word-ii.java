class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : word.toCharArray()) {
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }

        int sum = 0 , ch = 0;
        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());

        for (int val : list) {
            sum += (val * (ch / 8 + 1));
            ch++;
        }
        return sum;
    }
}