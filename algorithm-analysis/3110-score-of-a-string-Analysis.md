## [3110. Score of a String](https://leetcode.com/problems/score-of-a-string/)

### Approach I: Two-Pointer

#### Java:
```java
class Solution {
    public int scoreOfString(String s) {
        int score = 0;

        for (var i = 1; i < s.length(); i++){
            char prevChar = s.charAt(i-1);
            char currentChar = s.charAt(i);
            score += Math.abs(prevChar - currentChar);
        }

        return score;
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


