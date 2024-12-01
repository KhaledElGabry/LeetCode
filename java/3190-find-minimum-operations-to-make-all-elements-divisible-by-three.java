class Solution {
    public int minimumOperations(int[] nums) {
        if (nums.length == 0 || nums.length > 50) return -1;

        int operationCount = 0;

        for (int num : nums) {
            if (num % 3 != 0) {
                operationCount++;
            }
        }
        return operationCount;
    }
}