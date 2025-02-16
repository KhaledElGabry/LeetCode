## [2027. Minimum Moves to Convert String](https://leetcode.com/problems/minimum-moves-to-convert-string/)

### Approach I: Greedy

#### Java:
```java
class Solution {
    public int minimumMoves(String s) {

        // validation
        if (s == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        int moves = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == 'X') {
                moves++;
                i += 3; // skip next 2 positions
            } else {
                i++;
            }
        }
        return moves;
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

