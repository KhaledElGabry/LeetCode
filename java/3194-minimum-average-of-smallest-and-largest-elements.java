public class Solution {
    public double minimumAverage(int[] nums) {

        // validation
        if (nums.length < 2 || nums.length > 50 || nums.length % 2 == 1) {
            throw new IllegalArgumentException("Invalid");
        }

        Arrays.sort(nums);

        double minAvg = Double.MAX_VALUE;
        int left = 0;
        int right = nums.length - 1;

        for (int i = 0; i < nums.length / 2; i++) {

            if (nums[i] < 1 || nums[i] > 50) {
                throw new IllegalArgumentException("Invalid");
            }

            double avg = (nums[left] + nums[right]) / 2.0;

            if (avg < minAvg) {
                minAvg = avg;
            }

            left++;
            right--;
        }

        return minAvg;
    }
}
