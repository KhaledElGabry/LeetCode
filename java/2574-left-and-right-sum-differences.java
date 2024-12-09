class Solution {
    public int[] leftRightDifference(int[] nums) {
        if (nums.length == 0 || nums.length > 1000) throw new IllegalArgumentException("invalid input");

        int[] answer = new int[nums.length];
        int[] leftSum = new int[nums.length];
        leftSum[0] = 0;
        int[] rightSum = new int[nums.length];
        rightSum[nums.length - 1] = 0;


        // calculate left sums
        for (int i = 1; i < leftSum.length; i++) {
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }

        // calculate right sums
        for (int j = nums.length - 2; j >= 0; j--) {
            rightSum[j] = rightSum[j+1] + nums[j+1];
        }

        // calculate all absolute difference between left and right sums
        for (int k = 0; k < answer.length; k++) {
            answer[k] = Math.abs(leftSum[k] - rightSum[k]);
        }

        return answer;
    }
}