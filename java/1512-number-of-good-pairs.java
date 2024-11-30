class Solution {

    // using nested loop
    public int numIdenticalPairs(int[] nums) {
        if (nums == null || nums.length < 1 || nums.length > 100) {
            throw new IllegalArgumentException("Array length must be between 1 and 100");
        }

        int goodPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }

    // using hashmap
    public int numIdenticalPairs(int[] nums) {

        if (nums == null || nums.length < 1 || nums.length > 100) {
            throw new IllegalArgumentException("Array length must be between 1 and 100");
        }

        HashMap<Integer, Integer> freq = new HashMap<>();
        int goodPairs = 0;

        for (int num : nums){
            if(freq.containsKey(num)){
                goodPairs += freq.get(num);
            }
            freq.put(num, freq.getOrDefault(num,0) + 1);
        }

        return goodPairs;
    }
}