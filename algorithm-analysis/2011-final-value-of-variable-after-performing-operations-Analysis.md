## [2011. Final Value of Variable After Performing Operations](https://leetcode.com/problems/final-value-of-variable-after-performing-operations/)

### Approach I:

#### Java:
```java
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String i : operations) {
            X = i.equals("++X") || i.equals("X++") ? 1 + X : X - 1;
        }
        return X;
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


