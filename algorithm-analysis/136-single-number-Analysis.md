## [136. Single Number](https://leetcode.com/problems/single-number/)

### Approach I: Using XOR

#### Java:
```java
class Solution {
    public int singleNumber(int[] nums) {

        // validation
        if (nums.length < 1 || nums.length > 30000) {
            throw new IllegalArgumentException("Invalid Input");
        }
        
        int result = 0;
        for (int number : nums) {
            result = number ^ result;
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
- *Space Complexity:* $O(1)$


---


