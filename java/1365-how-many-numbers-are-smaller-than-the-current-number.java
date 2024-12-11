class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        if (nums.length < 2 || nums.length > 500) {
            throw new IllegalArgumentException("Invalid Input, it's less than 2 or bigger than 500");
        }
        int[] smallerThanCurrent = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 100 && nums[i] >= 0) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] > nums[j] && i != j) {
                        smallerThanCurrent[i]++;
                    }
                }
            } else {
                System.out.println("Invalid item value");
            }
        }
        return smallerThanCurrent;
    }
}