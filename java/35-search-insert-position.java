class Solution {
    public int searchInsert(int[] nums, int target) {

        // validation
        if(nums == null){
            throw new IllegalArgumentException("Invalid array input");
        }

        int low = 0;
        int high = nums.length - 1;

        while (low <= high){
            int mid = (low + high) / 2; // calculate the midpoint

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){ // move low after mid
                low = mid + 1;
            }else {
                high = mid - 1; // move high before mid
            }

        }

        return low; // low will always be where target should be inserted
    }
}