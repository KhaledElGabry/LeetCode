class Solution{
    public int removeDuplicates(int[] nums) {

        // validation
        if(nums.length < 1 || nums.length > 30_000){
            throw new IllegalArgumentException("Invalid input");
        }

        int writeIndex = 1; // position to write the next unique item

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < -100 || nums[i] > 100){
                throw new IllegalArgumentException("Invalid item value: "+ nums[i]);
            }

            if(nums[writeIndex - 1] != nums[i]){
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }

        return writeIndex;
    }
}