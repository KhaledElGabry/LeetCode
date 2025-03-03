## [136. Single Number](https://leetcode.com/problems/single-number/)

### Approach I: Using XOR

#### Java:
```java
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int number : nums) {
            result = number ^ result;
        }
        return result;
    }
}
```

#### Go:
```go
func singleNumber(nums []int) int {
    result := 0
    for i := 0; i < len(nums); i++ {
        result = nums[i] ^ result
    }
    return result
}
```

### Complexity Analysis:

- *Time Complexity:* $O(n)$
- *Space Complexity:* $O(1)$


---


