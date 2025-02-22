class Solution {

     // brute Force
     public int[] twoSum(int[] nums, int target) {

          for (int i = 0; i < nums.length; i++) {
               for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target)
                         return new int[] { i, j };
               }
          }
          return null;
     }


     // two-pointers using array
     public int[] twoSum(int[] nums, int target) {

          // create array to hold the original indices
          Integer[] indices = new Integer[nums.length];
          for (int i = 0; i < nums.length; i++) {
               indices[i] = i;
          }

          // sort the indices based on the values
          Arrays.sort(indices, Comparator.comparingInt(i -> nums[i]));

          int left = 0;
          int right = nums.length - 1;

          while (left < right) {
               int currentSum = nums[indices[left]] + nums[indices[right]];

               if (currentSum == target) {
                    return new int[]{indices[left], indices[right]};
               } else if (currentSum < target) {
                    left++;
               } else {
                    right--;
               }
          }

          return new int[]{-1, -1};
     }


     // HashTable
     public int[] twoSum(int[] nums, int target) {
          
          HashMap<Integer, Integer> map = new HashMap<>();

          for (int i = 0; i < nums.length; i++) {

               if (map.containsKey(target - nums[i])) {
                    return new int[] { map.get(target - nums[i]), i };
               } else {
                    map.put(nums[i], i);
               }
          }

          return new int[] { -1, -1 };
     }
}