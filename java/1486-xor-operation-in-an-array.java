class Solution {
    public int xorOperation(int n, int start) {

        // validation
        if (n < 1 || start < 0 || n > 1000 || start > 1000) {
            throw new IllegalArgumentException("Invalid");
        }

        int[] nums = new int[n];
        nums[0] = start;
        int result = 0;

        for (int i = 1; i < n; i++) {
            nums[i] = nums[i - 1] + 2;
        }

        for (int i = 0; i < n; i++) {
            result ^= start + 2 * i;
        }

        return result;
    }
}