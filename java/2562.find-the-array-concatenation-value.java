class Solution {
    public long findTheArrayConcVal(int[] nums) {

        // validation
        if (nums.length < 1 || nums.length > 1000) {
            throw new IllegalArgumentException("Invalid");
        }

        int left = 0;
        int right = nums.length - 1;
        long result = 0;

        while (left <= right) {

            if (left == right) {
                result += nums[left];
                break;
            }

            String concatNumbers = String.valueOf(nums[left]) + String.valueOf(nums[right]);
            result += Long.valueOf(concatNumbers);

            left++;
            right--;
        }

        return result;
    }
}