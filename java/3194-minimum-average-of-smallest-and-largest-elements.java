public class Solution {
    public double minimumAverage(int[] nums) {

        // validation
        if (nums.length < 2 || nums.length > 50 || nums.length % 2 == 1) {
            throw new IllegalArgumentException("Invalid input");
        }

        Arrays.sort(nums); // sort the input array

        double minAvg = Double.MAX_VALUE; // to track the minimum average found
        int left = 0;
        int right = nums.length - 1;

        // iterates over half of the array
        for (int i = 0; i < nums.length / 2; i++) {

            if (nums[i] < 1 || nums[i] > 50) {
                throw new IllegalArgumentException("Invalid number value: "+ nums[i]);
            }

            double avg = (nums[left] + nums[right]) / 2.0;

            if (avg < minAvg) { // updates minAvg if a new minimum is found
                minAvg = avg;
            }

            left++;
            right--;
        }

        return minAvg;
    }
}
