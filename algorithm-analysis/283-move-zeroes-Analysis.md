## [283. Move Zeroes](https://leetcode.com/problems/move-zeroes)

### Approach I: Two-Pointers

#### Java:
```java
class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for (int right = 0; right  nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
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

- *Time Complexity:* $O(n)$
- *Space Complexity:* $O(1)$


---

