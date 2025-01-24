class Solution {
    public int removeElement(int[] nums, int val) {

        // validation
        if (nums.length < 0 || nums.length > 100) {
            throw new IllegalArgumentException("Invalid input array");
        }
        if (val < 0 || val > 100) {
            throw new IllegalArgumentException("Invalid input val");
        }

        int k = 0; // count of non-val elements

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < 0 || nums[i] > 50) {
                throw new IllegalArgumentException("Invalid element value: " + nums[i]);
            }

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}