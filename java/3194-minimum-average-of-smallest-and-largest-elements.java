public class Solution {
    public double minimumAverage(int[] nums) {

        Arrays.sort(nums); // sort the input array

        double minAvg = Double.MAX_VALUE;
        int left = 0;
        int right = nums.length - 1;

        for (int i = 0; i < nums.length / 2; i++) {
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