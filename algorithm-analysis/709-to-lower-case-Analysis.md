## [709. To Lower Case](https://leetcode.com/problems/to-lower-case/)

### Approach I: Using toLowerCase built-in Method

#### Java:
```java
class Solution {
    public String toLowerCase(String s) {

        //validation
        if (s.length() < 1 || s.length() > 100) {
            throw new IllegalArgumentException("Invalid String Length");
        }

        return s.toLowerCase();
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

