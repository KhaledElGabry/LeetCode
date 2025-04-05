## [3190. Find Minimum Operations to Make All Elements Divisible by Three](https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/)

### Approach I:

#### Java:
```java
class Solution {
    public int minimumOperations(int[] nums) {
        int operationCount = 0;

        for (int num : nums) {
            if (num % 3 != 0) {
                operationCount++;
            }
        }

        return operationCount;
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


