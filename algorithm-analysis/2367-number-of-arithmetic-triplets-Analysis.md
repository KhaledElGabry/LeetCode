## [2367. Number of Arithmetic Triplets](https://leetcode.com/problems/number-of-arithmetic-triplets/)

### Approach I: Binary Search

#### Java:
```java
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {

        // validation
        if (nums == null || nums.length < 3 || nums.length > 200) {
            throw new IllegalArgumentException("Invalid array input");
        }

        if (diff < 1 || diff > 50) {
            throw new IllegalArgumentException("Invalid diff value");
        }

        for (int number : nums) {
            if (number < 0 || number > 200) {
                throw new IllegalArgumentException("Invalid number value: " + number);
            }
        }


        int count = 0;

        for (int j = 0; j < nums.length; j++) {

            // search for i in the left part (0 to j-1)
            int i = nums[j] - diff;
            int leftResult = Arrays.binarySearch(nums, 0, j, i);
            boolean foundI = leftResult >= 0;

            // search for k in the right part (j+1 to end)
            int k = nums[j] + diff;
            int rightResult = Arrays.binarySearch(nums, j + 1, nums.length, k);
            boolean foundK = rightResult >= 0;


            if (foundI && foundK) {
                count++;
            }

        }

        return count;
    }
}
```

[//]: # (#### Go:)

[//]: # (```go)

[//]: # (func solution&#40;&#41; {)

[//]: # ()
[//]: # (})

[//]: # (```)

### Complexity Analysis:

- *Time Complexity:* $O(n\ log\ n)$
- *Space Complexity:* $O(1)$


---

