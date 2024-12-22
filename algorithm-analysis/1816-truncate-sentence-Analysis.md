## [1816. Truncate Sentence](https://leetcode.com/problems/truncate-sentence/)

### Approach I: Using StringBuilder with Converting String to StringArray

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

### Approach II: Using While-loop to find kth word's end position

#### Java:
```java
class Solution {
    public String truncateSentence(String s, int k) {

        // validations
        if (s == null || s.length() < 1 || s.length() > 500) {
            throw new IllegalArgumentException("invalid string");
        }


        int wordCount = 0;
        int i = 0;
        while (i < s.length() && wordCount < k) {
            while (i < s.length() && s.charAt(i) != ' ') {
                i++;
            }

            wordCount++;
            if (wordCount < k) {
                i++;
            }
        }

        return s.substring(0, i);
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

- *Time Complexity:* $O(m)$ where $m$ is length up to kth word
- *Space Complexity:* $O(1)$

---