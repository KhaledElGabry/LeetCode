## [2697. Lexicographically Smallest Palindrome](https://leetcode.com/problems/lexicographically-smallest-palindrome/)

### Approach I: Two Pointers

#### Java:
```java
class Solution {
    public String makeSmallestPalindrome(String s) {

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // replace the character with the smaller one to ensure lexicographical order
            if (chars[left] != chars[right]) {
                char min = (char) Math.min(chars[left], chars[right]);
                chars[left] = min;
                chars[right] = min;
            }

            left++;
            right--;
        }

        return new String(chars);
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

