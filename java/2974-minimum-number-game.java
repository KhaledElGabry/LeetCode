class Solution {

    // approach1 (insertion sort)
    public int[] numberGame(int[] nums) {
        // sort nums using insertion sort
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j;
            for (j = i - 1; j >= 0 ; --j) {
                if(key < nums[j]) {
                    nums[j+1] = nums[j];
                }else break;
            }
            nums[j+1] = key;
        }

        int[] arr = new int[nums.length];
        // swap adjacent items
        for (int i = 0; i < nums.length; i += 2) {
            if (i + 1 < nums.length) {
                arr[i] = nums[i + 1];
                arr[i + 1] = nums[i];
            }
        }

        return arr;
    }

    // approach 2 (Arrays.sort)
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums); // sort nums
        int[] arr = new int[nums.length];

        // swap adjacent items
        for (int i = 0; i < nums.length; i += 2) {
            if (i + 1 < nums.length) {
                arr[i] = nums[i + 1];
                arr[i + 1] = nums[i];
            }
        }

        return arr;
    }

}