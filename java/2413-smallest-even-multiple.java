class Solution {
    public int smallestEvenMultiple(int n) {
        if (n == 0 || n > 150) throw new IllegalArgumentException("invalid input");
        if (n % 2 == 0) {
            return n;
        }
        return 2 * n;
    }
}