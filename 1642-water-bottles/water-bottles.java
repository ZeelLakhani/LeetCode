class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drunk = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            int full = empty / numExchange;
            drunk += full;
            empty = empty % numExchange + full;
        }
        return drunk;
    }
}