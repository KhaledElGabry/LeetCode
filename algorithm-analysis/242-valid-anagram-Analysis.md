## [242. Valid Anagram](https://leetcode.com/problems/valid-anagram/)

### Approach I: Sort

#### Java:
```java
class Solution {
    public boolean isAnagram(String s, String t) {

        //validation
        if (s.isEmpty() || t.isEmpty() || s.length() > 50_000 || t.length() > 50_000) {
            throw new IllegalArgumentException("Invalid input length");
        }

        if (s.length() != t.length()) {
            return false;
        }

        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
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

