## [1662. Check If Two String Arrays are Equivalent](https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/)

### Approach I: String Concatenation

#### Java:
```java
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        //validation
        if (word1.length > 1000 || word2.length > 1000) {
            throw new IllegalArgumentException("Invalid array input");
        }

        String str1 = String.join("", word1);
        String str2 = String.join("", word2);

        return str1.equals(str2);
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

- *Time Complexity:* $O(n + m)$ where $n$ and $m$ is the total number of characters in word1, word2.
- *Space Complexity:* $O(n + m)$ due to the storage of the concatenated strings.


---

