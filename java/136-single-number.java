class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 0)
            throw new IllegalArgumentException("Invalid Input");

        int result = 0;

        for (int number : nums) {
            result = number ^ result;
        }

        return result;
    }
}