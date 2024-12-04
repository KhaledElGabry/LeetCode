<br>
<h1 align="center">Algorithm Analysis</h1>

## [136. Single Number](https://leetcode.com/problems/single-number/)

### Approach I: Using XOR

#### Java:
```java
class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 0)
            throw new IllegalArgumentException("Invalid Input");

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

- *Time Complexity:* $O(\ n)$
- *Space Complexity:* $O(\ 1)$


---


