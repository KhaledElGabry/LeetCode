## [27. Remove Element](https://leetcode.com/problems/remove-element/)

### Approach I: Two Pointers

#### Java:
```java
class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0; // count of non-val elements

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < 0 || nums[i] > 50) {
                throw new IllegalArgumentException("Invalid element value: " + nums[i]);
            }

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
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

