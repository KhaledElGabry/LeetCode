## [228. Summary Ranges](https://leetcode.com/problems/summary-ranges/)

### Approach I: Two Pointers

#### Java:
```java
class Solution {
    public List<String> summaryRanges(int[] nums) {

        // validation
        if (nums.length < 0 || nums.length > 20) {
            throw new IllegalArgumentException("Invalid input");
        }

        List<String> result = new ArrayList<>();
        if (nums.length == 0)
            return result;

        int start = nums[0];
        int end = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end = nums[i];
            } else {
                // add the current range to the result
                if (start == end) {
                    result.add(Integer.toString(start));
                } else {
                    result.add(start + "->" + end);
                }
                // reset pointers for the next range
                start = nums[i];
                end = nums[i];
            }
        }

        // add the last range
        if (start == end) {
            result.add(Integer.toString(start));
        } else {
            result.add(start + "->" + end);
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

