## [2235. Add Two Integers](https://leetcode.com/problems/add-two-integers/)

### Approach I: 

#### Java:
```java
class Solution {
    public int sum(int num1, int num2) {
        if (num1 < -100 || num2 > 100)
            throw new IllegalArgumentException("Numbers must be between -100 and 100");
        return num1 + num2;
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

- *Time Complexity:* $O(1)$
- *Space Complexity:* $O(1)$


---



