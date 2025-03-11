class Solution {
    public int minimumOperations(int[] nums) {
        int operationCount = 0;

        for (int num : nums) {
            if (num % 3 != 0) {
                operationCount++;
            }
        }

        return operationCount;
    }
}