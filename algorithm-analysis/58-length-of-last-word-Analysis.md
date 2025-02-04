## [58. Length of Last Word](https://leetcode.com/problems/length-of-last-word/)

### Approach I: Backward Iteration

#### Java:
```java
class Solution {
    public int lengthOfLastWord1(String s) {

        // validation
        if (s == null || s.isEmpty() || s.length() > 10_000) {
            throw new IllegalArgumentException("Invalid input String");
        }

        s = s.trim(); // trim the string to remove leading and trailing spaces
        int length = 0;

        // iterate from the end of the string
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length > 0) {
                break;
            }
        }
        return length;
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

### Approach II: Backward Iteration (Recommended)

#### Java:
```java
class Solution {
    public int lengthOfLastWord(String s) {

        // validation
        if (s == null || s.isEmpty() || s.length() > 10_000) {
            throw new IllegalArgumentException("Invalid input String");
        }

        s = s.trim(); // trim the string to remove leading and trailing spaces
        int length = 0;

        // iterate from the end of the string
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            length++;
        }
        return length;
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