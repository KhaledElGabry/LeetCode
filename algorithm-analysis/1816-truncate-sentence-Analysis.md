## [1816. Truncate Sentence](https://leetcode.com/problems/truncate-sentence/)

### Approach I: 

#### Java:
```java
class Solution {
    public String truncateSentence(String s, int k) {

        // validations
        if (s == null || s.length() < 1 || s.length() > 500) {
            throw new IllegalArgumentException("invalid string");
        }

        String[] strToArray = s.split(" ");
        StringBuilder truncSentence = new StringBuilder();
        for (int i = 0; i < k; i++) {
            truncSentence.append(strToArray[i]).append(" ");
        }

        return truncSentence.substring(0, truncSentence.length() - 1);
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
- *Space Complexity:* $O(n)$

---


