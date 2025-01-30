## [1486. XOR Operation in an Array](https://leetcode.com/problems/xor-operation-in-an-array/)

### Approach I: 

#### Java:
```java
class Solution {
    public int xorOperation(int n, int start) {

        // validation
        if (n < 1 || start < 0 || n > 1000 || start > 1000) {
            throw new IllegalArgumentException("Invalid");
        }

        int[] nums = new int[n];
        nums[0] = start;
        int result = 0;

        for (int i = 1; i < n; i++) {
            nums[i] = nums[i - 1] + 2;
        }

        for (int i = 0; i < n; i++) {
            result ^= start + 2 * i;
        }

        return result;
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
- *Space Complexity:* $O(n)$


---
