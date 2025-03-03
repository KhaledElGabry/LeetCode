class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int number : nums) {
            result = number ^ result;
        }
        return result;
    }
}