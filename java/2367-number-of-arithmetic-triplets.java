class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;

        for (int j = 0; j < nums.length; j++) {
            // search for i in the left part (0 to j-1)
            int i = nums[j] - diff;
            int leftResult = Arrays.binarySearch(nums, 0, j, i);
            boolean foundI = leftResult >= 0;

            // search for k in the right part (j+1 to end)
            int k = nums[j] + diff;
            int rightResult = Arrays.binarySearch(nums, j + 1, nums.length, k);
            boolean foundK = rightResult >= 0;


            if (foundI && foundK) {
                count++;
            }
        }

        return count;
    }
}