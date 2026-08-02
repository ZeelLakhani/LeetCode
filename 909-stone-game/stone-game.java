class Solution {
    public boolean stoneGame(int[] piles) {
        int left = 0 , right = piles.length - 1;
        int alice = 0 , bob = 0;
        int turn = 0;

        while (left < right) {
            if (turn == 0) {
                if (piles[left] < piles[right]) alice += piles[right--];
                else alice += piles[left++];
                turn = 1;
            } else {
                if (piles[left] < piles[right]) alice += piles[right--];
                else alice += piles[left++];
                turn = 0;
            }
        }
        
        return alice >= bob;
        // return true;
    }
}