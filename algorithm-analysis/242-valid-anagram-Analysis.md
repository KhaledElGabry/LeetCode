## [242. Valid Anagram](https://leetcode.com/problems/valid-anagram/)

### Approach I: Sort

#### Java:
```java
class Solution {
    public boolean isAnagram(String s, String t) {
        // convert the two strings into array of chars
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();

        // sort the characters
        Arrays.sort(charsS);
        Arrays.sort(charsT);

        return Arrays.equals(charsS, charsT);
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

- *Time Complexity:* $O(n\ log\ n)$
- *Space Complexity:* $O(n)$


---

