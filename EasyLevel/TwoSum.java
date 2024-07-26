import java.util.Arrays;


public class TwoSum {
     public static void main(String[] args) {

          int[] nums = { 2, 5, 10, 17 };
          int target = 12;
          myTwoSum(nums, target);

          int[] result = Solution.twoSum(nums, target);
          System.out.println(Arrays.toString(result));

     }
     
     // My very first Solution 
     public static void myTwoSum(int[] nums, int target) {
          for (int i = 0; i < nums.length; i++) {
               int done = 0;
               for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                         done = nums[i] + nums[j];
                         System.out.println("[" + i + "," + j + "]");
                    }
               }
               if (done == target) break; 
          }
     }
}

     // LeetCode Submited Solution
class Solution {
     public static int[] twoSum(int[] nums, int target) {
          for (int i = 0; i < nums.length; i++) {
               for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target)
                         return new int[] { i, j };
               }
          }
          return null;
     }
}

