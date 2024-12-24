## [1221. Split a String in Balanced Strings](https://leetcode.com/problems/split-a-string-in-balanced-strings/)

### Approach I: Greedy Algorithm

#### Java:
```java
class Solution {
    public int balancedStringSplit(String s) {

        // validations
        if (!(s.length() >= 2) || !(s.length() <= 1000)) {
            throw new IllegalArgumentException("invalid");
        }


        int balance = 0;
        int count = 0;
        for (char c : s.toCharArray()) {

            if (c == 'R') {
                balance++;
            } else if (c == 'L') {
                balance--;
            }

            if (balance == 0) {
                count++;
            }
        }

        return count;
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