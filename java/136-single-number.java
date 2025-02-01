class Solution {
    public int singleNumber(int[] nums) {

        // validation
        if (nums.length < 1 || nums.length > 30000) {
            throw new IllegalArgumentException("Invalid Input");
        }

        int result = 0;
        for (int number : nums) {
            result = number ^ result;
        }

        return result;
    }
}