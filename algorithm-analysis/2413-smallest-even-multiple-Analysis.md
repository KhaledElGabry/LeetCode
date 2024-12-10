<br>
<h1 align="center">Algorithm Analysis</h1>

## [2413. Smallest Even Multiple](https://leetcode.com/problems/smallest-even-multiple/)

### Approach I: 

#### Java:
```java
class Solution {
    public int smallestEvenMultiple(int n) {
        if (n == 0 || n > 150) throw new IllegalArgumentException("invalid input");
        if (n % 2 == 0) {
            return n;
        }
        return 2 * n;
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

- *Time Complexity:* $O(\ 1)$
- *Space Complexity:* $O(\ 1)$


---


