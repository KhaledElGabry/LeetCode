class Solution {
    public int theMaximumAchievableX(int num, int t) {
        if(num < 1 || t > 50) throw new IllegalArgumentException("Wrong inputs; it should be within 1 to 50, inclusive.");

        int maxAchiveable = t * 2 + num;

        return maxAchiveable;
    }
}