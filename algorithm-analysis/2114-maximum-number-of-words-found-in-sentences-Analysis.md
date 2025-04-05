## [2114. Maximum Number of Words Found in Sentences](https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/)

### Approach I: 

#### Java:
```java
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxOfWords = 0;
        String sentenceWithMostSpaces = "";

        for (String sentence : sentences) {
            int currentSpaces = 1 + sentence.length() - sentence.replace(" ", "").length();
            if (currentSpaces > maxOfWords) {
                maxOfWords = currentSpaces;
                sentenceWithMostSpaces = sentence;
            }
        }

        return maxOfWords;
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