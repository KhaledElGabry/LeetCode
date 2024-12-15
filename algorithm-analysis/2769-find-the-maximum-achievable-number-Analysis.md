## [2769. Find the Maximum Achievable Number](https://leetcode.com/problems/find-the-maximum-achievable-number/)

### Approach I: 

#### Java:
```java
class Solution {
    public int theMaximumAchievableX(int num, int t) {
        if(num < 1 || t > 50) throw new IllegalArgumentException("Wrong inputs; it should be within 1 to 50, inclusive.");

        int maxAchiveable = t * 2 + num;

        return maxAchiveable;
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


